package com.amigos.dao;

import java.util.List;

import com.amigos.entities.AppraisalForms;


public interface AppraisalFormsDAO {
	
	List<AppraisalForms>getAllAppraisalForms();
	
	void addAppraisalForms(AppraisalForms appraisalForm);
	
	void updateAppraisalForms(AppraisalForms appraisalForm);
	
	void deleteAppraisalForm(int appraisalFormId);
	
	AppraisalForms getAppraisalFormById(int appraisalFormId);

}
