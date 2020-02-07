package com.microservice.daos;

import com.microservice.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	@Autowired
	private SessionFactory sf;

	@Override
	public Employee login(String username, String password) {
		Employee employee;
		try (Session s = this.sf.openSession()){
			String hql = "from Employee where username =: username and password =: password";
			Query query = s.createQuery(hql);
			query.setParameter("username", username.toLowerCase());
			query.setParameter("password", password);
			employee = (Employee) query.getSingleResult();
			employee.setPassword(null);
			return employee;
		} catch (Exception e) {
			return null;
		}
	}

}
