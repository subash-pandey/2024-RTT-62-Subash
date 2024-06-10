package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OneToMany {
     private CustomerDAO customerDAO = new CustomerDAO();
     private OrderDAO orderDAO = new OrderDAO();
     Scanner scanner = new Scanner(System.in);

    public Integer validateCustomerId(){

        while (true) {
            try {
                System.out.println("Enter a valid  customer id: ");
                Integer customerId = scanner.nextInt();
                return  customerId;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid Integer value: ");
                scanner.nextLine();
            }
        }


    }

    public void printOrderList(List<Order> orderList) {
        for (Order order : orderList) {
            System.out.println(order);
        }
    }

    public void run(){
        Integer customerId = validateCustomerId();
        Customer customer = customerDAO.findById(customerId);

        if (customer == null) {
            System.out.println("Customer not found so it did not have any orders , duh!!!");
        }else {
            List<Order> orderList = orderDAO.findByCostumerId(customerId);
            printOrderList(orderList);
        }
    }

    public static void main(String[] args) {
        OneToMany oneToMany = new OneToMany();
        oneToMany.run();
    }




}
