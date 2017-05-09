package com.test.ssh.service;

import java.util.List;

import com.test.ssh.dao.EmployeeDao;
import com.test.ssh.entities.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAll(){
		List<Employee> employees=employeeDao.getAll();
		return employees;
		
	}
}
