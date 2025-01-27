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
@Table(name = "EmployeeManagers")
public class EmployeeManagers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RelationshipID")
	private int relationshipId;
	
	@ManyToOne
	@JoinColumn(name = "EmployeeID")
	private Employees employee;
	
	@ManyToOne
	@JoinColumn(name = "ManagerID")
	private Employees manager;
	
	@Column(name = "RelationshipType")
	private String relastionshipType;
	
	
	public EmployeeManagers() {
		// TODO Auto-generated constructor stub
	}


	public EmployeeManagers(int relationshipId, Employees employee, Employees manager, String relastionshipType) {
		super();
		this.relationshipId = relationshipId;
		this.employee = employee;
		this.manager = manager;
		this.relastionshipType = relastionshipType;
	}


	public int getRelationshipId() {
		return relationshipId;
	}


	public void setRelationshipId(int relationshipId) {
		this.relationshipId = relationshipId;
	}


	public Employees getEmployee() {
		return employee;
	}


	public void setEmployee(Employees employee) {
		this.employee = employee;
	}


	public Employees getManager() {
		return manager;
	}


	public void setManager(Employees manager) {
		this.manager = manager;
	}


	public String getRelastionshipType() {
		return relastionshipType;
	}


	public void setRelastionshipType(String relastionshipType) {
		this.relastionshipType = relastionshipType;
	}


	@Override
	public String toString() {
		return "EmployeeManagers [relationshipId=" + relationshipId + ", employee=" + employee + ", manager=" + manager
				+ ", relastionshipType=" + relastionshipType + "]";
	}
	
	
	
}
