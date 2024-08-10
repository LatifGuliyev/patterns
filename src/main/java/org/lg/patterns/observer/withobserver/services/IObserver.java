package org.lg.patterns.observer.withobserver.services;

import org.lg.patterns.observer.common.models.Account;

public interface IObserver {
    void notify(Account account);
}
