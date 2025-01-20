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
@Table(name = "TrainingFeedback")
public class TrainingFeedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FeedbackID")
	private int feedbackId;
	
	@ManyToOne
	@JoinColumn(name = "ScheduleID")
	private TrainingSchedules trainingSchedule;
	
	@ManyToOne
	@JoinColumn(name = "ParticipantID")
	private Employees participant;
	
	@Column(name = "FeedbackComments")
	private String feedbackComments;
	
	@Column(name = "SatisfactionRating")
	private int satisfactionRating;
	
	

}
