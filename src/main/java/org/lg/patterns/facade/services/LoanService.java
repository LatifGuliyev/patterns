package org.lg.patterns.facade.services;

public class LoanService implements ILoanService {
    @Override
    public void getLoanDetails(String loanId) {
        System.out.println("Fetching details for loan ID: " + loanId);
    }

    @Override
    public void applyForLoan(String customerId, double amount) {
        System.out.println("Applying for loan of " + amount + " for customer ID: " + customerId);
    }

    @Override
    public void makeRepayment(String loanId, double amount) {
        System.out.println("Making repayment of " + amount + " for loan ID: " + loanId);
    }
}