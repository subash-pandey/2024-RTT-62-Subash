package com.example.springboot.service;


import com.example.springboot.database.dao.EmployeeDAO;
import com.example.springboot.database.dao.OfficeDAO;
import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import com.example.springboot.form.CreateEmployeeFormBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.hibernate.query.sqm.tree.SqmNode.log;

@Slf4j
@Component
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    @Autowired
    private OfficeDAO officeDAO;

    public Employee createEmployee(CreateEmployeeFormBean form){
        // log out the incoming variables that are in the CreateEmployeeFormBean
        // variable name
        log.info(form.toString());

        // setting the incoming user input onto a new Employee object to be saved to the database
        Employee employee = employeeDAO.findById(form.getEmployeeId());
        if (employee == null) {
            employee = new Employee();
        }

        employee.setEmail(form.getEmail());
        employee.setFirstName(form.getFirstName());
        employee.setLastName(form.getLastName());
        employee.setReportsTo(form.getReportsTo());
        employee.setExtension(form.getExtension());
        employee.setJobTitle(form.getJobTitle());

        Office office = officeDAO.findById(form.getOfficeId());
        // this wont work because its set to insertable = false and updateable = false
        //employee.setOfficeId(1);
        employee.setOffice(office);

        // when we save to the data base it will auto increment to give us a new id
        // the new ID is available in the return from the save method.
        // basically returns the same object .. after its been inserted into the database
        employee = employeeDAO.save(employee);
        return employee;
    }


}
