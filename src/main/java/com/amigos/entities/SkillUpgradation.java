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
@Table(name = "SkillUpgradation")
public class SkillUpgradation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UpgradationID")
	private int upgradationId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "SkillName")
	private String skillName;
	
	@Column(name = "PreviousSkillLevel")
	private int previousSkillLevel;
	
	@Column(name = "NewSkillLevel")
	private int newSkillLevel;
	
	@Column(name = "UpgradationDate")
	private LocalDate upgradationDate;
	
	@ManyToOne
	@JoinColumn(name = "UpgradedBy")
	private Employees upgradedBy;
	

}
