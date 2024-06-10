package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDAO {

    public Order  findById(int id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT o FROM Order o where o.id = :id";
        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        }
        catch (NoResultException e) {
            System.out.println(e.getMessage());
            return null;
        }
        finally {
            session.close();
        }
    }
    public List<Order> findByCostumerId(Integer costumerId) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "Select o from Order o where o.customerId= :xCustomerId";
        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("xCustomerId", costumerId);
        return query.getResultList();
    }
}
