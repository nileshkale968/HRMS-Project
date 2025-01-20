package com.amigos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LeaveTypes")
public class LeaveTypes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LeaveTypeID")
	private int leaveTypeId;
	
	@Column(name = "LeaveTypeName")
	private String leaveTypeName;
	
	@Column(name = "Description")
	private String description;

}
