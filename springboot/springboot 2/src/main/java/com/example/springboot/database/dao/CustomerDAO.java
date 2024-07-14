package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Customer;
import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CustomerDAO  extends JpaRepository<Customer,Long> {
    Customer findById(Integer id);



    List<Customer> findBySalesRepEmployeeId(Integer salesRepEmployeeId);

}
