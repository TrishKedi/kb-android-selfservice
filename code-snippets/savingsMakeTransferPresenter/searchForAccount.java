// This method searches through a list of AccountOption objects for a specific account ID

public AccountOption searchAccount(List<AccountOption> accountOptions, final long accountId) {
    final AccountOption[] result = {new AccountOption()};
    Observable.fromIterable(accountOptions)
            .filter(new Predicate<AccountOption>() {
                @Override
                public boolean test(AccountOption option) {
                    return (accountId == option.getAccountId());
                }
            })
            .subscribe(new Consumer<AccountOption>() {
                @Override
                public void accept(AccountOption option) {
                    result[0] = option;
                }
            });
    return result[0];
}
