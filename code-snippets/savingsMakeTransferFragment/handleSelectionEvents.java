// This code handles selection events for spPayTo and spPaymentType spinners:

@Override
public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    switch (parent.getId()) {
        case R.id.sp_pay_to:
            payTo = listPayTo.get(position).getAccountNumber();
            break;
        case R.id.sp_payment_type:
            PaymentTypes selectedPaymentType = (PaymentTypes) spPaymentType.getItemAtPosition(position);
            if (selectedPaymentType == PaymentTypes.MOBILE_MONEY) {
                transferType = Constants.TRANSFER_FROM_MOMO;
            }
            break;
    }
}
