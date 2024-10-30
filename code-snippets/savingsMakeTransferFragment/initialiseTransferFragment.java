public static SavingsMakeTransferFragment newInstance(long accountId, String transferType) {
    SavingsMakeTransferFragment transferFragment = new SavingsMakeTransferFragment();
    Bundle args = new Bundle();
    args.putLong(Constants.ACCOUNT_ID, accountId);
    args.putString(Constants.TRANSFER_TYPE, transferType);
    transferFragment.setArguments(args);
    return transferFragment;
}

@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_savings_make_transfer, container, false);
    ((BaseActivity) getActivity()).getActivityComponent().inject(this);
    setToolbarTitle(getString(R.string.transfer));
    ButterKnife.bind(this, rootView);
    savingsMakeTransferPresenter.attachView(this);
    sweetUIErrorHandler = new SweetUIErrorHandler(getActivity(), rootView);
    showUserInterface();
    spPaymentType.setAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, PaymentTypes.values()));
    return rootView;
}
