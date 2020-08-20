package com.gaap.mp.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaap.mp.models.Employee;
import com.gaap.mp.service.EmployeeService;

/**
 * <div style="font-siza: 130%;">Rest Controller for Employee service<div/>
 * <ul>
 * <li>Class model for Employee</li>
 * </ul>
 */
@RestController
@RequestMapping("employees")
public class EmployeeRest {
    /**
     * The Logger.
     */
    Logger logger = LoggerFactory.getLogger(EmployeeRest.class);

    /**
     * The Employee service.
     */
    @Autowired
EmployeeService employeeService;

    /**
     * Get employees response entity.
     *
     * @return the response entity
     */
    @GetMapping("listEmployees")
public ResponseEntity<List<Employee>> getEmployees(){
		return new ResponseEntity(employeeService.getEmployees(), HttpStatus.OK);
	}

    /**
     * Create employee response entity.
     *
     * @param emp the emp
     * @return the response entity
     */
    @PostMapping
public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
	emp = employeeService.createEmployee(emp);
	logger.info("Employee created: "+emp.toString());
	return new ResponseEntity<Employee>(emp, HttpStatus.OK);
}
	
}
