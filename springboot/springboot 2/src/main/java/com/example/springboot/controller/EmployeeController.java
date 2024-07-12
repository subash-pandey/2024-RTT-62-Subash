package com.example.springboot.controller;

import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
}
