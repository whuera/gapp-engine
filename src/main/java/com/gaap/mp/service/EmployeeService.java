package com.gaap.mp.service;

import java.util.ArrayList;
import java.util.List;

import com.gaap.mp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaap.mp.models.Employee;

/**
 * The type Employee service.
 */
@Service
public class EmployeeService {
    /**
     * The Employee repository.
     */
    @Autowired
	EmployeeRepository employeeRepository;

    /**
     * The Employees list.
     */
    List<Employee> employeesList = new ArrayList<>();

    /**
     * Get employees list.
     *
     * @return the list
     */
    public List<Employee> getEmployees(){
		for(int i = 0; i <= 5; i++) {			
		Employee employee = new Employee(Integer.toString(i), "Pedro", "Perez","tester", "pperez@test.com");				
		employeesList.add(employee);
		//employeeRepository.save(employee);
		}
		return employeesList;
	}

    /**
     * Create employee employee.
     *
     * @param emp the emp
     * @return the employee
     */
    public Employee createEmployee(Employee emp) {
		Employee newEmployee = new Employee();
		newEmployee.setCode(emp.getCode());
		newEmployee.setNameEmployee(emp.getNameEmployee());
		newEmployee.setLastNameEmployee(emp.getLastNameEmployee());
		newEmployee.setMail(emp.getMail());
		newEmployee.setRol(emp.getRol());
		employeesList.add(emp);
		employeeRepository.save(emp);
		return emp;
	}
	

}
