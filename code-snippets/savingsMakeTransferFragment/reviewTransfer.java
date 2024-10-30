//The reviewTransfer method validates inputs and initiates the transfer process:

@OnClick(R.id.btn_review_transfer)
void reviewTransfer() {
    if (etRemark.getText().toString().trim().isEmpty()) {
        showToaster(getString(R.string.remark_is_mandatory));
        return;
    }
    if (transferType.equals(Constants.TRANSFER_FROM_MOMO) && etMobileNumber.getText().toString().trim().isEmpty()) {
        showToaster(getString(R.string.number_is_mandatory));
        return;
    }
    // Set up and launch the transfer fragment
}
