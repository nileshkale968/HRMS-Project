package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Certifications;

public interface CertificationsDAO {
	
	List<Certifications>getAllCertifications();
	
	void addCertifications(Certifications certification);
	
	void updateCertifications(Certifications certification);
	
	void deleteCertification(int certificationId);
	
	Certifications getCertificationById(int certificationId);

}
