package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveRequests;


public interface LeaveRequestsDAO {
	
	List<LeaveRequests>getAllLeaveRequests();
	
	void addLeaveRequests(LeaveRequests leaveRequest);
	
	void updateLeaveRequests(LeaveRequests leaveRequest);
	
	void deleteLeaveRequest(int leaveRequestId);
	
	LeaveRequests getLeaveRequestById(int leaveRequestId);

}
