package org.example.database.dao;

import org.example.database.entity.Customer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CustomerDAOTest {
    private static CustomerDAO customerDAO = new CustomerDAO();

    public void beforeALL(){

    }

    @Test
    public void findByIdTest(){
        //given
        Integer usedId = 103;


       //when
        Customer customer = customerDAO.findById(usedId);


       //then
        Assertions.assertNotNull(customer);
        Assertions.assertEquals(usedId, customer.getId());
       Assertions.assertEquals("Atelier graphique",customer.getCustomerName());
       Assertions.assertEquals("Schmitt",customer.getContactLastName());
    }

    @Test
    public void findByInvalidIdTest(){
        Integer usedId = 1010102;
        Customer customer = customerDAO.findById(usedId);
        Assertions.assertNull(customer);
    }

    @Test
    public void createNewCustomerTest(){
        Customer given = new Customer();
        given.setCustomerName("Test Customer");
        given.setContactLastName("LastName");
        given.setContactFirstName("FirstName");
        given.setAddressLine1("AddressLine1");
        given.setCity("City");
        given.setState("State");
        given.setCountry("Country");
        given.setPostalCode("PostalCode");
        given.setPhone("1234567890");




        customerDAO.insert(given);

        //then
        Customer actual = customerDAO.findById(given.getId());
        Assertions.assertNotNull(actual);

    }



}
