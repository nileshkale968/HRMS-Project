package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.SkillMatrix;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SkillMatrixDAOImpl implements SkillMatrixDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<SkillMatrix> getAllSkillMatrix() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from SkillMatrix", SkillMatrix.class).getResultList();
	}

	@Override
	public void addSkillMatrix(SkillMatrix skillMatrix) {
		entityManager.unwrap(Session.class).saveOrUpdate(skillMatrix);
		
	}

	@Override
	public void updateSkillMatrix(SkillMatrix skillMatrix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSkillMatrix(int skillMatrixId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SkillMatrix getSkillMatrixById(int skillMatrixId) {
		// TODO Auto-generated method stub
		return null;
	}

}
