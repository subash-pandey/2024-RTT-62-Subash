package com.example.springboot.controller;


import com.example.springboot.database.dao.CustomerDAO;
import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Product;
import com.example.springboot.form.CreateCustomerFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;
    @Autowired
    private EmployeeDAO employeeDAO;




    @GetMapping("/index/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("customer-index");
        Customer customer = customerDAO.findById(id);
        response.addObject("customer", customer);

        return response;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView("customer/create");
        List<Employee> employees = employeeDAO.findByJobTitle("Sales Rep");
        response.addObject("employees", employees);
        return response;
    }
    @GetMapping("/submit")
    public ModelAndView submit(CreateCustomerFormBean form) {
        ModelAndView response = new ModelAndView();
        Customer customer = new Customer();
        customer.setCustomerName(form.getCustomerName());
        customer.setContactFirstName(form.getContactFirstName());
        customer.setContactLastName(form.getContactLastName());
        customer.setAddressLine1(form.getAddressLine1());
        customer.setAddressLine2(form.getAddressLine2());
        customer.setCity(form.getCity());
        customer.setState(form.getState());
        customer.setPostalCode(form.getPostalCode());
        customer.setCountry(form.getCountry());
        customer.setPhone(form.getPhone());
        customer.setCreditLimit(form.getCreditLimit());
        Employee employee = employeeDAO.findById(form.getSalesRep());
        customer.setEmployee(employee);

        customer = customerDAO.save(customer);
        response.setViewName("redirect:/customer/index/" + customer.getId());


        return response;


    }

}

