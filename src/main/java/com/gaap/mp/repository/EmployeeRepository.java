package com.gaap.mp.repository;

import com.gaap.mp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface EmployeeRepository extends JpaRepository<Employee, String> { }
