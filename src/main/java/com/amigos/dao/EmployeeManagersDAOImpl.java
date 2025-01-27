package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.EmployeeManagers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeManagersDAOImpl implements EmployeeManagersDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<EmployeeManagers> getAllEmployeeManagers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from EmployeeManagers", EmployeeManagers.class).getResultList();
	}

	@Override
	public void addEmployeeManagers(EmployeeManagers employeeManager) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(employeeManager);
		
	}

	@Override
	public void updateEmployeeManagers(EmployeeManagers employeeManager) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeManager(int employeeManagerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EmployeeManagers getEmployeeManagerById(int employeeManagerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
