//  uses SweetUIErrorHandler to show an error layout if network connectivity is missing or an error occurs:

@Override
public void showError(String message) {
    if (!Network.isConnected(getContext())) {
        sweetUIErrorHandler.showSweetNoInternetUI(layoutMakeTransfer, layoutError);
    } else {
        sweetUIErrorHandler.showSweetErrorUI(message, layoutMakeTransfer, layoutError);
    }
}
