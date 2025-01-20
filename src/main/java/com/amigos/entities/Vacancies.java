package com.amigos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vacancies")
public class Vacancies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VacancyID")
	private int vacancyId;
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Departments department;
	
	@Column(name = "Position")
	private String position;
	
	@Column(name = "RequiredSkillSet")
	private String requiredSkillSet;
	
	@Column(name = "NumberOfOpenings")
	private int numberOfOpenings;

}
