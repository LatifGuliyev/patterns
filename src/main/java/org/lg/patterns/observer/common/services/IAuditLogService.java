package org.lg.patterns.observer.common.services;

import org.lg.patterns.observer.common.models.Account;

public interface IAuditLogService {
    void logActivity(Account account);
}
