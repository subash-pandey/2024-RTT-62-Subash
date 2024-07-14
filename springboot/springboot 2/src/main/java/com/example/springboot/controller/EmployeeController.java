package com.example.springboot.controller;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller

public class EmployeeController {

    @Autowired
    private EmployeeDAO employeeDAO;

    @GetMapping("/employee/search")
    public ModelAndView employeeSearch(@RequestParam(required = false)String employeeSearch) {

        ModelAndView response = new ModelAndView("employee-search");

        response.addObject("employeeSearch", employeeSearch);
        List<Employee> employees = employeeDAO.findByLastName(employeeSearch);
        response.addObject("employees", employees);
        return response;
    }

    @GetMapping("/employee/{id}")
    public ModelAndView indexPathVar(@PathVariable Integer id) {
        ModelAndView response = new ModelAndView("customer-list");
        Employee employee = employeeDAO.findById(id);
        response.addObject("employee", employee);

        return response;
    }





}
