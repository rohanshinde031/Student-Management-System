package com.growstar.dao;

import java.util.List;

import com.growstar.Model.User;

public interface UserDao {
	
	public boolean  addUser(User user);
	
	public User getUserByid(long id);
	
	public boolean isUserExists(String contact);
	
	public List<User> getAllUsers();
	
	public String removeUserByid(long id);

}
