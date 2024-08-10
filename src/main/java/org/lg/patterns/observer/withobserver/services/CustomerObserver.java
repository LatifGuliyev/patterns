package org.lg.patterns.observer.withobserver.services;

import org.lg.patterns.observer.common.models.Account;
import org.lg.patterns.observer.common.services.ISmsAlertService;

public class CustomerObserver implements IObserver {

    private final ISmsAlertService smsAlertService;

    public CustomerObserver(ISmsAlertService smsAlertService) {
        this.smsAlertService = smsAlertService;
    }

    @Override
    public void notify(Account account) {
        if (account.getBalance() < account.getThreshold()) {
            smsAlertService.sendEmail(account,
                    "Your account balance is below the threshold! Balance: %s".formatted(account.getBalance()));
        }
    }
}
