package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Employee;
import com.example.springboot.database.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeDAO extends JpaRepository<Employee,Long> {


  Employee findById(Integer employeeId);
  Employee findByEmailIgnoreCase(String email);

  @Query("Select e from Employee e  where e.lastName like concat('%', :name, '%') OR e.firstName like concat('%', :name, '%') ")
    List<Employee> findByLastName( String name);

  Office findByOfficeId(Integer officeId);
}
