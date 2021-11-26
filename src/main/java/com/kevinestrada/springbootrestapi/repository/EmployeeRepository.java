package com.kevinestrada.springbootrestapi.repository;

import com.kevinestrada.springbootrestapi.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
