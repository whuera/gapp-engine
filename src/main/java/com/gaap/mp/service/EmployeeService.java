package com.gaap.mp.service;

import java.util.ArrayList;
import java.util.List;

import com.gaap.mp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaap.mp.models.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	List<Employee> employeesList = new ArrayList<>();
	public List<Employee> getEmployees(){		
		for(int i = 0; i <= 5; i++) {			
		Employee employee = new Employee(Integer.toString(i), "Pedro", "Perez","tester", "pperez@test.com");				
		employeesList.add(employee);
		//employeeRepository.save(employee);
		}
		return employeesList;
	}
	
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
