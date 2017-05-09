package com.test.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.test.ssh.entities.Employee;

public class EmployeeDao {
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		return this.sessionFactory.openSession();
	}


	public List<Employee> getAll(){
		String sql="from Employee";
		return getSession().createQuery(sql).list();
		
	}
}
