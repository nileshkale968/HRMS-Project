package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Trainers;

public interface TrainersDAO {
	
	List<Trainers>getAllTrainers();
	
	void addTrainers(Trainers trainer);
	
	void updateTrainers(Trainers trainer);
	
	void deleteTrainer(int trainerId);
	
	Trainers getTrainerById(int trainerId);

}
