package com.amigos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amigos.entities.Users;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsersDAOImpl implements UsersDAO{
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return entityManager.unwrap(Session.class).createQuery("from Users", Users.class).getResultList();
	}

	@Override
	public void addUsers(Users user) {
		
		entityManager.unwrap(Session.class).saveOrUpdate(user);
		
	}

	@Override
	public void updateUsers(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
