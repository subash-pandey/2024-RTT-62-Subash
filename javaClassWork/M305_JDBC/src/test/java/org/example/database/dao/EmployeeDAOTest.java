package org.example.database.dao;

import org.example.database.entity.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        Assertions.assertEquals(employee.getLastname(), actual.getLastname());
        Assertions.assertEquals(employee.getEmail(), actual.getEmail());
        Assertions.assertEquals(employee.getOfficeId(), actual.getOfficeId());
        Assertions.assertEquals(employee.getReportsTo(), actual.getReportsTo());
        Assertions.assertEquals(employee.getExtension(), actual.getExtension());
        Assertions.assertEquals(employee.getJobTitle(), actual.getJobTitle());
        Assertions.assertEquals(employee.getJobTitle(), actual.getJobTitle());
        Assertions.assertEquals(employee.getFirstname(), actual.getFirstname());

        employeeDAO.delete(employee);

    }

    @ParameterizedTest
    @CsvSource({"Leslie","Tom"})
    public void findByFirstNameTest(String firstName){
        List<Employee> employees = employeeDAO.findByFirstName(firstName);

        Assertions.assertNotNull(employees);
        Assertions.assertTrue(employees.size() > 0);

        for(Employee employee : employees){
            Assertions.assertEquals(firstName, employee.getFirstname());
        }

    }
}
