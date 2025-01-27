package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveTypes;


public interface LeaveTypesDAO {
	
	List<LeaveTypes>getAllLeaveTypes();
	
	void addLeaveTypes(LeaveTypes leaveType);
	
	void updateLeaveTypes(LeaveTypes leaveType);
	
	void deleteLeaveType(int leaveTypeId);
	
	LeaveTypes getLeaveTypeById(int leaveTypeId);

}
