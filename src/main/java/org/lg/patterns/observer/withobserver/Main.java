package org.lg.patterns.observer.withobserver;

import org.lg.patterns.observer.common.services.AuditLogService;
import org.lg.patterns.observer.common.services.IAccountService;
import org.lg.patterns.observer.common.services.IAuditLogService;
import org.lg.patterns.observer.common.services.ISmsAlertService;
import org.lg.patterns.observer.common.services.SmsAlertService;
import org.lg.patterns.observer.withobserver.services.AccountService;
import org.lg.patterns.observer.withobserver.services.AccountSubjectManager;
import org.lg.patterns.observer.withobserver.services.AuditObserver;
import org.lg.patterns.observer.withobserver.services.CustomerObserver;
import org.lg.patterns.observer.withobserver.services.IObserver;
import org.lg.patterns.observer.withobserver.services.ISubject;

public class Main {
    public static void main(String... args) {
        IAuditLogService auditLogService = new AuditLogService();
        IObserver auditObserver = new AuditObserver(auditLogService);

        ISmsAlertService smsAlertService = new SmsAlertService();
        IObserver customerNotificationObserver = new CustomerObserver(smsAlertService);

        ISubject accountSubjectManager = new AccountSubjectManager();

        IAccountService accountService = new AccountService(accountSubjectManager);

        accountSubjectManager.registerObserver(auditObserver);
        accountSubjectManager.registerObserver(customerNotificationObserver);

        accountService.withdraw(1111, 900.0);
        accountService.deposit(2222, 900.0);
        accountService.withdraw(3333, 2700.0);
    }
}
