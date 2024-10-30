//filter and map AccountOption items to AccountDetail items, based on specific conditions

public List<AccountDetail> getAccountNumbers(List<AccountOption> accountOptions,
        final boolean isTypePayFrom, final boolean getLoanAccounts) {
    final List<AccountDetail> accountNumber = new ArrayList<>();
    Observable.fromIterable(accountOptions)
            .filter(new Predicate<AccountOption>() {
                @Override
                public boolean test(AccountOption option) {
                    if (!isTypePayFrom && getLoanAccounts) {
                        return option.getAccountType().getCode().equals(context.getString(R.string.account_type_loan));
                    }
                    if (!isTypePayFrom && !getLoanAccounts) {
                        return option.getAccountType().getCode().equals(context.getString(R.string.account_type_savings));
                    }
                    return !(option.getAccountType().getCode().equals(context.getString(R.string.account_type_loan)) && isTypePayFrom);
                }
            })
            .flatMap(new Function<AccountOption, Observable<AccountDetail>>() {
                @Override
                public Observable<AccountDetail> apply(AccountOption option) {
                    return Observable.just(new AccountDetail(option.getAccountNo(), option.getAccountType().getValue()));
                }
            })
            .subscribe(new Consumer<AccountDetail>() {
                @Override
                public void accept(AccountDetail detail) {
                    accountNumber.add(detail);
                }
            });
    return accountNumber;
}
