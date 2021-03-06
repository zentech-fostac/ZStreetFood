package com.journaldev.spring.service;

import java.util.List;

import com.journaldev.spring.hb.model.Trainee;

public interface TraineeService {
	//Trainees
	public void addTrainee(Trainee p);
	public void updateTrainee(Trainee p);
	public List<Trainee> listTrainees();
	public Trainee getTraineeById(int id);
	public void removeTrainee(int id);
}
