//This method fetches account transfer templates from the server, managing progress and error messages for the view:

public void loanAccountTransferTemplate() {
    checkViewAttached();
    getMvpView().showProgress();
    compositeDisposables.add(dataManager.getAccountTransferTemplate()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribeWith(new DisposableObserver<AccountOptionsTemplate>() {
                @Override
                public void onComplete() {}

                @Override
                public void onError(Throwable e) {
                    getMvpView().hideProgress();
                    getMvpView().showError(context.getString(R.string.error_fetching_account_transfer_template));
                }

                @Override
                public void onNext(AccountOptionsTemplate template) {
                    getMvpView().hideProgress();
                    getMvpView().showSavingsAccountTemplate(template);
                }
            })
    );
}
