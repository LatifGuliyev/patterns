package org.lg.patterns.facade.services;

public class AccountService implements IAccountService {

    @Override
    public void deposit(String accountId, double amount) {
        System.out.println("Depositing " + amount + " to account ID: " + accountId);
    }

    @Override
    public void withdraw(String accountId, double amount) {
        System.out.println("Withdrawing " + amount + " from account ID: " + accountId);
    }

    @Override
    public double getBalance(String accountId) {
        System.out.println("Fetching balance info for account ID: " + accountId);
        return 100.0;
    }

    @Override
    public void closeAccount(String accountId) {
        System.out.println("Validating preconditions for account closure for account ID: " + accountId);
        System.out.println("Account ID: " + accountId + " is now closed");
    }
}
