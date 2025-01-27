package com.amigos.dao;

import java.util.List;

import com.amigos.entities.EmployeeManagers;


public interface EmployeeManagersDAO {
	
	List<EmployeeManagers>getAllEmployeeManagers();
	
	void addEmployeeManagers(EmployeeManagers employeeManager);
	
	void updateEmployeeManagers(EmployeeManagers employeeManager);
	
	void deleteEmployeeManager(int employeeManagerId);
	
	EmployeeManagers getEmployeeManagerById(int employeeManagerId);

}
