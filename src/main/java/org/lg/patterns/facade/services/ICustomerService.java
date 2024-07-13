package org.lg.patterns.facade.services;

public interface ICustomerService {
    void getCustomerDetails(String customerId);

    void updateCustomerDetails(String customerId, String newDetails);
}
