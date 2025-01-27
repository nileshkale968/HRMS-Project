package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.TrainingSchedules;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrainingSchedulesDAOImpl implements TrainingSchedulesDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TrainingSchedules> getAllTrainingSchedules() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from TrainingSchedules", TrainingSchedules.class).getResultList();
	}

	@Override
	public void addTrainingSchedules(TrainingSchedules trainingSchedule) {
		entityManager.unwrap(Session.class).saveOrUpdate(trainingSchedule);
		
	}

	@Override
	public void updateTrainingSchedules(TrainingSchedules trainingSchedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTrainingSchedule(int trainingScheduleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TrainingSchedules getTrainingScheduleById(int trainingScheduleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
