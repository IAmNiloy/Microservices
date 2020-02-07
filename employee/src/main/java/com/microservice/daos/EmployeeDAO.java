package com.microservice.daos;

import org.springframework.stereotype.Repository;

import com.microservice.models.Employee;

@Repository
public interface EmployeeDAO {
	public Employee login(String username, String password);

}
