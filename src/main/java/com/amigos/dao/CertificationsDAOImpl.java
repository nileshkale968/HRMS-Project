package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Certifications;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class CertificationsDAOImpl implements CertificationsDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Certifications> getAllCertifications() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Certifications", Certifications.class).getResultList();
	}

	@Override
	public void addCertifications(Certifications certification) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(certification);
		
	}

	@Override
	public void updateCertifications(Certifications certification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCertification(int certificationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Certifications getCertificationById(int certificationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
