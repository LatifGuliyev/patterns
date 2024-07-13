package org.lg.patterns.facade.services;

public interface IAccountService {

    void deposit(String accountId, double amount);

    void withdraw(String accountId, double amount);

    double getBalance(String accountId);

    void closeAccount(String accountId);
}
