package org.lg.patterns.observer.withobserver.services;

import org.lg.patterns.observer.common.models.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountSubjectManager implements ISubject {
    private final Set<IObserver> observers = new HashSet<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Account account) {
        for (IObserver observer : observers) {
            observer.notify(account);
        }
    }
}
