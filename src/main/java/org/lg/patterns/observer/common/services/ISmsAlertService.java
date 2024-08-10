package org.lg.patterns.observer.common.services;

import org.lg.patterns.observer.common.models.Account;

public interface ISmsAlertService {
    void sendEmail(Account account, String smsContent);
}
