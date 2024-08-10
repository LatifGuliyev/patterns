package org.lg.patterns.observer.common.models;

public class Account {
    private Integer id;
    private String name;
    private double balance;
    private double threshold;

    public Account(Integer id, String name, double balance, double threshold) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.threshold = threshold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}
