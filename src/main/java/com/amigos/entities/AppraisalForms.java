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
@Table(name = "AppraisalForms")
public class AppraisalForms {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FormID")
	private int formId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@Column(name = "SubmissionDate")
	private LocalDate submissionDate;
	
	@Column(name = "Rating")
	private int rating;
	
	@Column(name = "Comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "ReviewerID")
	private Employees reviewer;
	
	

}
