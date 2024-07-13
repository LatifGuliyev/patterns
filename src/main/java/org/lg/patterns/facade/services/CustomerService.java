package org.lg.patterns.facade.services;

public class CustomerService implements ICustomerService {
    @Override
    public void getCustomerDetails(String customerId) {
        System.out.println("Fetching details for customer ID: " + customerId);
    }

    @Override
    public void updateCustomerDetails(String customerId, String newDetails) {
        System.out.println("Updating details for customer ID: " + customerId + " with: " + newDetails);
    }
}