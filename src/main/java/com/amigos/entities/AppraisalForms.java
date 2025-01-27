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
	
	public AppraisalForms() {
		// TODO Auto-generated constructor stub
	}

	public AppraisalForms(int formId, Employees employee, LocalDate submissionDate, int rating, String comments,
			Employees reviewer) {
		super();
		this.formId = formId;
		this.employee = employee;
		this.submissionDate = submissionDate;
		this.rating = rating;
		this.comments = comments;
		this.reviewer = reviewer;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

	public LocalDate getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Employees getReviewer() {
		return reviewer;
	}

	public void setReviewer(Employees reviewer) {
		this.reviewer = reviewer;
	}

	@Override
	public String toString() {
		return "AppraisalForms [formId=" + formId + ", employee=" + employee + ", submissionDate=" + submissionDate
				+ ", rating=" + rating + ", comments=" + comments + ", reviewer=" + reviewer + "]";
	}
	
	

}
