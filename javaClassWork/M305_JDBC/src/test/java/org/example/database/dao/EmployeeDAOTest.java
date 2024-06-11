package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeDAOTest {
    private static EmployeeDAO employeeDAO = new EmployeeDAO();


    @BeforeAll
    @AfterAll
    public static void beforeAll(){
       List<Employee> employees = employeeDAO.findByFirstName("Aarush");
       for(Employee employee : employees){
           employeeDAO.delete(employee);
       }

    }



    @Test
    public void findByIdTest(){

        Integer givenId = 1002;

        Employee employee = employeeDAO.findById(givenId);
        Assertions.assertNotNull(employee);
        Assertions.assertEquals(givenId, employee.getId());
        Assertions.assertEquals("Diane",employee.getFirstname());

    }

    @Test
    public void findByInvalidIdTest(){
        Integer givenId = 100200;
        Employee employee = employeeDAO.findById(givenId);
        Assertions.assertNull(employee);
    }
     @Test
    public void insertTest(){
        Employee employee = new Employee();
        employee.setFirstname("Aarush");
        employee.setLastname("Pandey");
        employee.setEmail("aarush@gmail.com");
        employee.setOfficeId(4);
        employee.setReportsTo(1102);
        employee.setExtension("x1222");
        employee.setJobTitle("Sales Rep");

        employeeDAO.insert(employee);

        Employee actual = employeeDAO.findById(employee.getId());
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(employee.getFirstname(), actual.getFirstname());

    }

    @Test
    public void findByFirstNameTest(){
        List<Employee> employees = employeeDAO.findByFirstName("Aarush");

        Assertions.assertNotNull(employees);
        Assertions.assertTrue(employees.size() > 0);
        Assertions.assertTrue(employees.stream().anyMatch(employee -> employee.getFirstname().equals("Aarush")));
    }
}
