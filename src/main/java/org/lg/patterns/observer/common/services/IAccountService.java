package org.lg.patterns.observer.common.services;

import org.lg.patterns.observer.common.models.Account;

public interface IAccountService {
    Account withdraw(Integer accountId, Double withdrawAmount);

    Account deposit(Integer accountId, Double depositAmount);
}
