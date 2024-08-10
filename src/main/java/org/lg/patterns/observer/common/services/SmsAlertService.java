package org.lg.patterns.observer.common.services;

import org.lg.patterns.observer.common.models.Account;

public class SmsAlertService implements ISmsAlertService {
    @Override
    public void sendEmail(Account account, String smsContent) {
        System.out.println("Email Alert: " + smsContent);
    }
}
