package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Product;
import com.example.springboot.database.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserDAO extends JpaRepository<User, Long> {

    User findByEmailIgnoreCase(String email);


}