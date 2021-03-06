package com.nagidi.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.nagidi.dao.EmployeeDAO;
import com.nagidi.entity.EmployeeEntity;

public class EmployeeServiceImpl implements EmployeeService {
	//Employee dao injected by Spring context
    private EmployeeDAO employeeDAO;
	
	//This method will be called when a employee object is added
	@Transactional
	public void addEmployee(EmployeeEntity employee) {
		employeeDAO.addEmployee(employee);
	}
	
	//This method return list of employees in database
	@Transactional
	public List<EmployeeEntity> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
	//Deletes a employee by it's id
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDAO.deleteEmployee(employeeId);
	}
	
	//This setter will be used by Spring context to inject the dao's instance
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void addEmployee(EmployeeDAO employee) {
		// TODO Auto-generated method stub
		
	}
}
