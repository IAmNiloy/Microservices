package com.microservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.daos.EmployeeDAO;
import com.microservice.models.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO employeeDAO;
	
	public Employee login(String username, String password) {
		return employeeDAO.login(username, password);
	}

}
