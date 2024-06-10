package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Employee;
import org.example.database.entity.Product;

import java.util.List;
import java.util.Scanner;

public class FirstHibernateDemo {
    private static ProductDAO productDAO = new ProductDAO();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//
//        List<Employee> employees = employeeDAO.findByFirstName("Leslie");
//        //List<Employee> employees = employeeDAO.findByLastName("Doe");
//
//        for ( Employee employee : employees ) {
//           // System.out.println(employee.getId() + " | " + employee.getFirstname() + " " + employee.getLastname() + " | "
//                   // + employee.getEmail() + " | " + employee.getJobTitle());
//            System.out.println(employee);
//        }
//
//        Employee employee = employeeDAO.findById(1056);
//        System.out.println(employee);
//        System.out.println("z".repeat(30));
//        Employee employee1 =employeeDAO.findById(10);
//        System.out.println(employee1);


        List<Product> products = productDAO.findByName("Ford");
        for (Product product : products) {
            System.out.println(product);
        }


    }

}
