package com.example.springboot.controller;


import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller

public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;


    @GetMapping("/customer/")
    public ModelAndView getCustomers(@RequestParam(required = false) Integer id) {
        ModelAndView response = new ModelAndView("customer-index");
        Customer customer = customerDAO.findById(id);
        log.info("customer: " + id);
        response.addObject("customer", customer);
        return response;
    }

    @GetMapping("/customer/index/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("customer-index");
        Customer customer = customerDAO.findById(id);
        response.addObject("customer", customer);

        return response;
    }
    @GetMapping("/customer/list/{salesRepId}")
    public ModelAndView listPathVar(@PathVariable Integer salesRepId) {
        ModelAndView response = new ModelAndView("customer-list");
        Employee employee = employeeDAO.findById(salesRepId);
        response.addObject("employee", employee);
        List<Customer> customers = customerDAO.findBySalesRepEmployeeId(salesRepId);
        response.addObject("customers", customers);
        return response;
    }
}

