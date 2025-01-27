package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Vacancies;

public interface VacanciesDAO {
	
	List<Vacancies>getAllVacancies();
	
	void addVacancies(Vacancies vacancie);
	
	void updateVacancies(Vacancies vacancie);
	
	void deleteVacancie(int vacancieId);
	
	Vacancies getVacancieById(int vacancieId);

}
