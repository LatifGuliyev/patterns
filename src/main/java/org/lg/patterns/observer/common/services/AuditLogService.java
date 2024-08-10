package org.lg.patterns.observer.common.services;

import org.lg.patterns.observer.common.models.Account;

public class AuditLogService implements IAuditLogService {

    @Override
    public void logActivity(Account account) {
        System.out.printf("Audit Log: Account %s balance updated. New balance is: %s%n",
                account.getId(), account.getBalance());
    }
}
