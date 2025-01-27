package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.SkillUpgradation;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SkillUpgradationDAOImpl implements SkillUpgradationDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<SkillUpgradation> getAllSkillUpgradation() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from SkillUpgradation", SkillUpgradation.class).getResultList();
	}

	@Override
	public void addSkillUpgradation(SkillUpgradation skillUpgradation) {
		entityManager.unwrap(Session.class).saveOrUpdate(skillUpgradation);
		
	}

	@Override
	public void updateSkillUpgradation(SkillUpgradation skillUpgradation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSkillUpgradation(int skillUpgradationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SkillUpgradation getSkillUpgradationById(int skillUpgradationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
