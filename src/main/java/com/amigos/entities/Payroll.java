package com.amigos.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payroll {
	
	private int payrollId;
	
	private Employees employee;
	
	private String salaryMonth;
	
	private int salaryYear;
	
	private BigDecimal basicSalary;
	
	private BigDecimal allowances;
	
	private BigDecimal deductions;
	
	private BigDecimal netSalary;
	
	private LocalDate paymentDate;

}
