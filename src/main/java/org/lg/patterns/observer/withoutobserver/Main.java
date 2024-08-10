package org.lg.patterns.observer.withoutobserver;

import org.lg.patterns.observer.common.services.IAccountService;
import org.lg.patterns.observer.withoutobserver.services.AccountService;
import org.lg.patterns.observer.common.services.AuditLogService;
import org.lg.patterns.observer.common.services.IAuditLogService;
import org.lg.patterns.observer.common.services.ISmsAlertService;
import org.lg.patterns.observer.common.services.SmsAlertService;

public class Main {
    public static void main(String... args) {
        IAuditLogService auditLogService = new AuditLogService();
        ISmsAlertService smsAlertService = new SmsAlertService();
        IAccountService accountService = new AccountService(smsAlertService, auditLogService);

        accountService.withdraw(1111, 900.0);
        accountService.deposit(2222, 900.0);
        accountService.withdraw(3333, 2700.0);
    }
}
