package org.lg.patterns.facade;

public interface IBankingOperationsFacade {
    void openNewAccount(String customerId, String accountDetails, double initialDepositAmount);

    void closeAccount(String accountId);

    void handleLoanApplication(String customerId, double amount);
}
