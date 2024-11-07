package edu.icet.service;

import edu.icet.model.Branch;
import edu.icet.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomerByID(Long customerID);
    Customer searchCustomerByID(Long customerID);
    Customer searchCustomerByDLicense(String DLNumber);
    void updateCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
