package com.amigos.entities;

import java.math.BigDecimal;
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
@Table(name = "employees")

public class Employees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private int employeeId;
	
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "DateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Address")
	private String address;
	
	@Column(name = "NationalID")
	private String nationalId;
	
	@Column(name = "MaritalStatus")
	private String martialStatus;
	
	@Column(name = "EmergencyContactPhone")
	private String emergencyContactPhone;
	
	
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Departments department;
	
	@Column(name = "Position")
	private String position;
	
	@Column(name = "SkillSet")
	private String skillSet;
	
	@Column(name = "EmploymentStartDate")
	private LocalDate employmentStartDate;
	
	@Column(name = "EmploymentEndDate")
	private LocalDate employmentEndDate;
	
	@Column(name = "Salary")
	private BigDecimal salary;
	
	@Column(name = "EmploymentStatus")
	private String employmentStatus;
	
	@Column(name = "BankAccountNumber")
	private String bankAccountNumber;
	
	@ManyToOne
	@JoinColumn(name = "ManagerId")
	private Employees manager;
	
	@ManyToOne
	@JoinColumn(name = "RoleID")
	private Roles role;
}
