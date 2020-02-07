package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.microservice.daos.EmployeeDAOImpl;

@EnableEurekaClient
@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		/*
		 * EmployeeDAOImpl daoImpl = new EmployeeDAOImpl();
		 * 
		 * daoImpl.login("a","a");
		 */
		
	}

}
