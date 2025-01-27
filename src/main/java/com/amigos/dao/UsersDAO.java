package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Users;

public interface UsersDAO {
	
	List<Users>getAllUsers();
	
	void addUsers(Users user);
	
	void updateUsers(Users user);
	
	void deleteUser(int userId);
	
	Users getUserById(int userId);

}
