package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.EducationDetails;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EducationDetailsDAOImpl implements EducationDetailsDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<EducationDetails> getAllEducationDetails() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from EducationDetails", EducationDetails.class).getResultList();
	}

	@Override
	public void addEducationDetails(EducationDetails educationDetail) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(educationDetail);

	}

	@Override
	public void updateEducationDetails(EducationDetails educationDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEducationDetail(int educationDetailId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EducationDetails getEducationDetailById(int educationDetailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
