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
@Table(name = "SkillMatrix")
public class SkillMatrix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MatrixID")
	private int matrixId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "SkillName")
	private String skillName;
	
	@Column(name = "SkillLevel")
	private int skillLevel;
	
	@Column(name = "LastUpdated")
	private LocalDate lastUpdated;
	
}
