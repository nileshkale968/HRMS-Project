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
@Table(name = "Certifications")
public class Certifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CertificationID")
	private int certificationId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "CertificationName")
	private String certificationName;
	
	@Column(name = "CertificationAuthority")
	private String certificationAuthority;
	
	@Column(name = "IssueDate")
	private LocalDate issueDate;
	
	@Column(name = "ExpiryDate")
	private LocalDate expiryDate;

}
