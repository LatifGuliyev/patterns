package org.lg.patterns.facade;

import org.lg.patterns.facade.services.IAccountService;
import org.lg.patterns.facade.services.ICustomerService;
import org.lg.patterns.facade.services.ILoanService;

public class BankingOperationsFacade implements IBankingOperationsFacade {
    private final IAccountService accountService;
    private final ILoanService loanService;
    private final ICustomerService customerService;

    public BankingOperationsFacade(IAccountService accountService, ILoanService loanService, ICustomerService customerService) {
        this.accountService = accountService;
        this.loanService = loanService;
        this.customerService = customerService;
    }

    @Override
    public void openNewAccount(String customerId, String accountDetails, double initialDepositAmount) {
        // Combined operations for opening a new account
        customerService.updateCustomerDetails(customerId, accountDetails);
        accountService.deposit(customerId, initialDepositAmount);
        System.out.println("New account opened for customer ID: " + customerId);
    }

    @Override
    public void closeAccount(String accountId) {
        // Combined operations for closing an account
        accountService.withdraw(accountId, accountService.getBalance(accountId));
        accountService.closeAccount(accountId);
    }

    @Override
    public void handleLoanApplication(String customerId, double amount) {
        // Combined operations for handling a loan application
        customerService.getCustomerDetails(customerId);
        System.out.println("Analysing customer data to determine max loan allowance amount.");
        loanService.applyForLoan(customerId, amount);
        System.out.println("Loan application processed for customer ID: " + customerId + " for amount: " + amount);
    }
}

