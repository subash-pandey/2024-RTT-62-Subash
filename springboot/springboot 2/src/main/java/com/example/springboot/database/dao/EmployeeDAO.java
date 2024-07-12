package com.example.springboot.database.dao;

import com.example.springboot.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
    Employee findById(Integer employeeId);

    @Query("Select e from Employee e  where e.lastName like concat('%', :name, '%') OR e.firstName like concat('%', :name, '%') ")
    List<Employee> findByLastName( String name);
}
