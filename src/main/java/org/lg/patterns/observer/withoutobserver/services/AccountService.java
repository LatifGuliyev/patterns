package org.lg.patterns.observer.withoutobserver.services;

import org.lg.patterns.observer.common.models.Account;
import org.lg.patterns.observer.common.services.IAccountService;
import org.lg.patterns.observer.common.services.IAuditLogService;
import org.lg.patterns.observer.common.services.ISmsAlertService;

import java.util.Map;

public class AccountService implements IAccountService {

    private static final Map<Integer, Account> accountDatabase = Map.of(
            1111, new Account(1111, "User 1", 1000.0, 150.0),
            2222, new Account(2222, "User 2", 2000.0, 250.0),
            3333, new Account(3333, "User 3", 3000.0, 350.0)
    );

    private final ISmsAlertService smsAlertService;
    private final IAuditLogService auditLogService;

    public AccountService(ISmsAlertService smsAlertService, IAuditLogService auditLogService) {
        this.smsAlertService = smsAlertService;
        this.auditLogService = auditLogService;
    }

    @Override
    public Account withdraw(Integer accountId, Double withdrawAmount) {
        Account account = accountDatabase.get(accountId);
        Double currentBalance = account.getBalance();
        if (withdrawAmount > currentBalance) {
            throw new IllegalStateException("Withdraw amount can't be more than actual balance!");
        }
        account.setBalance(currentBalance - withdrawAmount);
        processNotifications(account);
        return account;
    }


    @Override
    public Account deposit(Integer accountId, Double depositAmount) {
        Account account = accountDatabase.get(accountId);
        Double currentBalance = account.getBalance();
        if (depositAmount <= 0) {
            throw new IllegalStateException("Deposit amount should be more than 0!");
        }
        account.setBalance(currentBalance + depositAmount);
        processNotifications(account);
        return account;
    }

    private void processNotifications(Account account) {
        if (account.getBalance() < account.getThreshold()) {
            smsAlertService.sendEmail(account,
                    "Your account balance is below the threshold! Balance: %s".formatted(account.getBalance()));
        }
        auditLogService.logActivity(account);
    }
}