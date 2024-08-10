package org.lg.patterns.observer.withobserver.services;

import org.lg.patterns.observer.common.models.Account;
import org.lg.patterns.observer.common.services.IAuditLogService;

public class AuditObserver implements IObserver {

    private final IAuditLogService auditLogService;

    public AuditObserver(IAuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @Override
    public void notify(Account account) {
        auditLogService.logActivity(account);
    }
}
