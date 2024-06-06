package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CustomerDAO {
    public List<Customer> findByCustomerName(String customerName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT c FROM Customer c where  c.customerName = :customerName";
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);
        query.setParameter("customerName", customerName);

        // when we know we are getting 0 or more records we use getResultList
        List<Customer> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }
    public List<Customer> findByContactFirstName(String contactFirstName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT c FROM Customer c where c.contactFirstName = :contactFirstName";
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);
        query.setParameter("contactFirstName", contactFirstName);
        List<Customer> result = query.getResultList();
        session.close();
        return result;
    }
}
