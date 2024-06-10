package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;

import java.util.List;

public class MainCustomer {

    public static void main(String[] args) {

        // Now creating a customer object for inserting a customer object into the mysql

        Customer customer = new Customer();
        customer.setCustomerName("Subash Inc");
        customer.setContactFirstName("Subash");
        customer.setContactLastName("Pandey");
        customer.setCity("Kathmandu");
        customer.setCountry("Nepal");
        customer.setPhone("+977984143348");
        customer.setAddressLine1("Kirtipur-1");
        customer.setAddressLine2(null);
        customer.setState("Bagmati");
        customer.setPostalCode("42344");
        customer.setSalesRepEmployeeId(1504);
        customer.setCreditLimit(20000.00);

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.insert(customer);


        List<Customer> result = customerDAO.findByCustomerName("Subash Inc");
        for (Customer customer1 : result) {
            System.out.println(customer1);
        }
        List<Customer> customers = customerDAO.findByContactFirstName("Subash");
        for (Customer customer1 : customers) {
            System.out.println(customer1);
        }
        Customer customer2 = customerDAO.findById(520);
        System.out.println(customer2);
    }
}
