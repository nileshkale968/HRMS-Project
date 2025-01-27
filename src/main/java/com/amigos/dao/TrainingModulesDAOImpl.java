package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.TrainingModules;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingModulesDAOImpl implements TrainingModulesDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TrainingModules> getAllTrainingModules() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from TrainingModules", TrainingModules.class).getResultList();
	}

	@Override
	public void addTrainingModules(TrainingModules trainingModules) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(trainingModules);
		
	}

	@Override
	public void updateTrainingModules(TrainingModules trainingModules) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingModule(int trainingModulesId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingModules getTrainingModuleById(int trainingModulesId) {
		// TODO Auto-generated method stub
		return null;
	}

}
