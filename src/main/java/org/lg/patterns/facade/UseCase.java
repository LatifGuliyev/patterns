package org.lg.patterns.facade;

import org.lg.patterns.facade.services.AccountService;
import org.lg.patterns.facade.services.CustomerService;
import org.lg.patterns.facade.services.IAccountService;
import org.lg.patterns.facade.services.ICustomerService;
import org.lg.patterns.facade.services.ILoanService;
import org.lg.patterns.facade.services.LoanService;

public class UseCase {

    IBankingOperationsFacade bankingOperationsFacade;

    public UseCase(BankingOperationsFacade bankingOperationsFacade) {
        this.bankingOperationsFacade = bankingOperationsFacade;
    }

    public static void main(String[] args) {
        // Create subsystem objects
        IAccountService accountService = new AccountService();
        ILoanService loanService = new LoanService();
        ICustomerService customerService = new CustomerService();


        // Initiate actual use case
        BankingOperationsFacade bankingOperationsFacade = new BankingOperationsFacade(accountService, loanService, customerService);
        UseCase useCase = new UseCase(bankingOperationsFacade);
        useCase.run();
    }

    public void run() {
        // Use the facade to perform simplified operations
        bankingOperationsFacade.openNewAccount("C12345", "Customer Name, Address, City", 10);
        bankingOperationsFacade.closeAccount("A12345");
        bankingOperationsFacade.handleLoanApplication("C67890", 15000.00);
    }
}
