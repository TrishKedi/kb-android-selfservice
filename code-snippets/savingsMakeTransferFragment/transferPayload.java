private void setupTransferPayload() {
    transferPayload = new TransferPayload();
    transferPayload.setFromAccountId(fromAccountOption.getAccountId());
    transferPayload.setFromClientId(fromAccountOption.getClientId());
    transferPayload.setTransferAmount(Double.parseDouble(etAmount.getText().toString()));
    transferPayload.setTransferDescription(etRemark.getText().toString());
    ((BaseActivity) getActivity()).replaceFragment(TransferProcessFragment.newInstance(transferPayload, TransferType.SELF, null), true, R.id.container);
}
