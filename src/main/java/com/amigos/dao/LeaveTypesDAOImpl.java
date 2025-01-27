package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.LeaveTypes;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LeaveTypesDAOImpl implements LeaveTypesDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<LeaveTypes> getAllLeaveTypes() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from LeaveTypes", LeaveTypes.class).getResultList();
	}

	@Override
	public void addLeaveTypes(LeaveTypes leaveType) {
		entityManager.unwrap(Session.class).saveOrUpdate(leaveType);
		
	}

	@Override
	public void updateLeaveTypes(LeaveTypes leaveType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLeaveType(int leaveTypeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LeaveTypes getLeaveTypeById(int leaveTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
