package org.lg.patterns.facade.services;

public interface ILoanService {
    void getLoanDetails(String loanId);

    void applyForLoan(String customerId, double amount);

    void makeRepayment(String loanId, double amount);
}
