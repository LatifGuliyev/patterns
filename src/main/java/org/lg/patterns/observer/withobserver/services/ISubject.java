package org.lg.patterns.observer.withobserver.services;

import org.lg.patterns.observer.common.models.Account;

public interface ISubject {
    void registerObserver(IObserver observer);

    void deregisterObserver(IObserver observer);

    void notifyObservers(Account account);
}
