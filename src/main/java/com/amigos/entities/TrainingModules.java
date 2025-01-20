package com.amigos.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TrainingModules")
public class TrainingModules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ModuleID")
	private int moduleId;
	
	@Column(name = "ModuleName")
	private String moduleName;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "Duration")
	private int duration;

}
