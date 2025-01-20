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
@Table(name = "LeaveRequests")
public class LeaveRequests {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LeaveRequestID")
	private int leaveRequestId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name = "LeaveType")
	private LeaveTypes leaveType;
	
	@Column(name = "StartDate")
	private LocalDate startDate;
	
	@Column(name = "EndDate")
	private LocalDate endDate;
	
	@Column(name = "LeaveReason")
	private String leaveReason;
	
	@Column(name = "Status")
	private String status;

}
