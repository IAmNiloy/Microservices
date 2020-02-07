package com.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservice.models.Employee;
import com.microservice.services.EmployeeService;

@RestController
@RequestMapping(value = { "/credential", "/login" })
public class EmployeeController {
	@Autowired 
	EmployeeService employeeService;
	
	@ResponseBody
	//@RequestMapping( method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<Employee> login(String username, String password) {
		return new ResponseEntity<>(this.employeeService.login(username, password),HttpStatus.OK);
	}
}
