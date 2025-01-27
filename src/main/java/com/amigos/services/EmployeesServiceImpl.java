package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.EmployeesDAO;
import com.amigos.entities.Employees;

import jakarta.transaction.Transactional;

@Service
public class EmployeesServiceImpl implements EmployeesService {
	
	@Autowired
	private EmployeesDAO employeeDAO;

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployees();
	}

	@Override
	public void addEmployee(Employees employee) {
		employeeDAO.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employees employee) {
		// TODO Auto-generated method stub
		employeeDAO.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(Employees employee) {
		
		employeeDAO.deleteEmployee(employee);
		
	}

	@Override
	public Employees getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeById(employeeId);
	}

	

	

}
