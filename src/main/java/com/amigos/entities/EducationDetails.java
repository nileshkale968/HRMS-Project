package com.amigos.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EducationDetails")
public class EducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EducationID")
	private int educationId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "Degree")
	private String degree;
	
	@Column(name = "Institute")
	private String institute;
	
	@Column(name = "Major")
	private String major;
	
	@Column(name  = "GraduationYear")
	private int graduationYear;
	
	@Column(name = "GPA")
	private BigDecimal gpa;
	
	

}
