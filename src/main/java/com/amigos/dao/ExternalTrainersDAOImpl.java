package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.ExternalTrainers;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ExternalTrainersDAOImpl implements ExternalTrainersDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<ExternalTrainers> getAllExternalTrainers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from ExternalTrainers", ExternalTrainers.class).getResultList();
	}

	@Override
	public void addExternalTrainers(ExternalTrainers externalTrainer) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(externalTrainer);
		
	}

	@Override
	public void updateExternalTrainers(ExternalTrainers externalTrainer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteExternalTrainer(int externalTrainerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ExternalTrainers getExternalTrainerById(int externalTrainerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
