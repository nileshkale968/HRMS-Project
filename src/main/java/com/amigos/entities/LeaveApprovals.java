package com.amigos.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "LeaveApprovals")
public class LeaveApprovals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ApprovalID")
	private int approvalId;
	
	@ManyToOne
	@JoinColumn(name = "LeaveRequestID")
	private LeaveRequests leaveRequest;
	
	@ManyToOne
	@JoinColumn(name = "ApproverID")
	private Employees approver;
	
	@Column(name = "ApprovalDate")
	private LocalDate approvalDate;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name = "Comments")
	private String comments;

}
