package com.amigos.dao;

import java.util.List;

import com.amigos.entities.ExternalTrainers;


public interface ExternalTrainersDAO {
	
	List<ExternalTrainers>getAllExternalTrainers();
	
	void addExternalTrainers(ExternalTrainers externalTrainer);
	
	void updateExternalTrainers(ExternalTrainers externalTrainer);
	
	void deleteExternalTrainer(int externalTrainerId);
	
	ExternalTrainers getExternalTrainerById(int externalTrainerId);

}
