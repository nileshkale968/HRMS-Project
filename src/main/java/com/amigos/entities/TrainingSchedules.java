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
@Table(name = "TrainingSchedules")
public class TrainingSchedules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ScheduleID")
	private int scheduleId;
	
	@ManyToOne
	@JoinColumn(name = "ModuleID")
	private TrainingModules trainingmodule;
	
	@ManyToOne
	@JoinColumn(name = "TrainerID")
	private Trainers trainer;
	
	@Column(name = "StartDate")
	private LocalDate startDate;
	
	@Column(name = "EndDate")
	private LocalDate endDate;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "MaxParticipants")
	private int maxParticipants;
	
	

}
