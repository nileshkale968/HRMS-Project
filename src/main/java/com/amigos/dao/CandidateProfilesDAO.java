package com.amigos.dao;

import java.util.List;

import com.amigos.entities.CandidateProfiles;


public interface CandidateProfilesDAO {
	
	List<CandidateProfiles>getAllCandidateProfiles();
	
	void addCandidateProfiles(CandidateProfiles candidateProfile);
	
	void updateCandidateProfiles(CandidateProfiles candidateProfile);
	
	void deleteCandidateProfile(int candidateProfileId);
	
	CandidateProfiles getCandidateProfileById(int candidateProfileId);

}
