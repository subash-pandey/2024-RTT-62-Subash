package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class EmployeeDAO {

    public List<Employee> findByFirstName(String firstName) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT e FROM Employee e where e.firstname = :firstname";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Employee> query = session.createQuery(hql,Employee.class);
// this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("firstname", firstName);

        // when we know we are getting 0 or more records we use getResultList
        List<Employee> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;
    }

    public List<Employee> findByLastName(String lastName) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT e FROM Employee e where e.lastname = :lastname";
        TypedQuery<Employee> query = session.createQuery(hql,Employee.class);
        query.setParameter("lastname", lastName);

        // when we know we are getting 0 or more records we use getResultList
        List<Employee> result = query.getResultList();

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
        session.close();

        return result;



    }
    public Employee findById(Integer id) {
        // these 2 lines of code prepare the hibernate session for use
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // JPA Query - the syntax is slightly different than regular SQL
        // SQL - "select * from employees e where e.firstname = ?"
        String hql = "SELECT e FROM Employee e where e.id = :id";

        // this typed query is how hibernate knows what kind of object of fill up with the query results
        TypedQuery<Employee> query = session.createQuery(hql,Employee.class);
// this is similar to the prepared statement, we are going to set the value in the query :firstname
        // to the value passed into the function
        query.setParameter("id", id);

        // when we know we are getting 0 or more records we use getResultList
        try {
            Employee result = query.getSingleResult();
            return result;
        }
        catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }

        // finally we close the hibernate session so it can release the resources its holding
        // specifically the connection pool and close the transaction
    }
    public void update(Employee employee) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Employee employee) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.delete(employee);
        session.getTransaction().commit();
        session.close();
    }
}
