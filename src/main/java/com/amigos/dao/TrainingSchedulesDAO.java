package com.amigos.dao;

import java.util.List;

import com.amigos.entities.TrainingSchedules;

public interface TrainingSchedulesDAO {
	
	List<TrainingSchedules>getAllTrainingSchedules();
	
	void addTrainingSchedules(TrainingSchedules trainingSchedule);
	
	void updateTrainingSchedules(TrainingSchedules trainingSchedule);
	
	void deleteTrainingSchedule(int trainingScheduleId);
	
	TrainingSchedules getTrainingScheduleById(int trainingScheduleId);

}
