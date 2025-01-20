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
@Table(name = "Payroll")
public class Payroll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PayrollID")
	private int payrollId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "SalaryMonth")
	private String salaryMonth;
	
	@Column(name = "SalaryYear")
	private int salaryYear;
	
	@Column(name = "BasicSalary")
	private BigDecimal basicSalary;
	
	@Column(name = "Allowances")
	private BigDecimal allowances;
	
	@Column(name = "Deductions")
	private BigDecimal deductions;
	
	@Column(name = "NetSalary")
	private BigDecimal netSalary;
	
	@Column(name = "PaymentDate")
	private LocalDate paymentDate;

}
