package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public Product findById(Integer id) {

        Session session = factory.openSession();
        String hql = "Select p from Product p where p.id =:id";
        TypedQuery<Product> query = session.createQuery(hql,Product.class);
        query.setParameter("id", id);

        try{
            Product p = query.getSingleResult();
            return p;
        }
        catch(Exception e){
            return null;

        }
        finally{
            session.close();
        }
    }
    public List<Product> findByName(String productName) {
        Session session = factory.openSession();
        String hql = "Select p from Product p where lower(p.productName) like lower(CONCAT('%',:name,'%'))";
        TypedQuery<Product> query = session.createQuery(hql,Product.class);
        query.setParameter("name",productName);
        List<Product > products = query.getResultList();

        session.close();
        return products;

    }
    public void update(Product product) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(product);
        session.getTransaction().commit();
        session.close();
    }
}
