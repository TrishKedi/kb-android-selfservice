package com.kanzubanking.mobile.ui.views;

import com.kanzubanking.mobile.models.templates.account.AccountOptionsTemplate;
import com.kanzubanking.mobile.ui.views.base.MVPView;

/**
 * Interface defining methods for Savings Transfer view.
 */
public interface SavingsMakeTransferMvpView extends MVPView {

    // Method to initialize the user interface for savings transfer
    void showUserInterface();

    // Display the savings account options template
    void showSavingsAccountTemplate(AccountOptionsTemplate accountOptionsTemplate);

    // Display a toast notification with a message
    void showToaster(String message);

    // Display an error message
    void showError(String message);

    // Show a progress dialog while processing
    void showProgressDialog();

    // Hide the progress dialog after processing is complete
    void hideProgressDialog();
}
