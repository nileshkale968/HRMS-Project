package com.amigos.dao;

import java.util.List;

import com.amigos.entities.LeaveApprovals;


public interface LeaveApprovalsDAO {
	
	List<LeaveApprovals>getAllLeaveApprovals();
	
	void addLeaveApprovals(LeaveApprovals leaveApproval);
	
	void updateLeaveApprovals(LeaveApprovals leaveApproval);
	
	void deleteLeaveApproval(int leaveApprovalId);
	
	LeaveApprovals getLeaveApprovalById(int leaveApprovalId);

}
