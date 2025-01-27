package com.amigos.dao;

import java.util.List;

import com.amigos.entities.EducationDetails;

public interface EducationDetailsDAO {
	
	List<EducationDetails>getAllEducationDetails();
	
	void addEducationDetails(EducationDetails educationDetail);
	
	void updateEducationDetails(EducationDetails educationDetail);
	
	void deleteEducationDetail(int educationDetailId);
	
	EducationDetails getEducationDetailById(int educationDetailId);

}
