package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;

import java.util.List;

public class MainCustomer {

    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        List<Customer> result =customerDAO.findByCustomerName("Muscle Machine Inc");
        for (Customer customer : result) {
            System.out.println(customer);
        }
        List<Customer> customers = customerDAO.findByContactFirstName("First Name");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
