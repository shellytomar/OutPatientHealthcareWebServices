package com.outpatientHealthcare.service;

import java.util.List;

import com.outpatientHealthcare.dao.UserDAO;
import com.outpatientHealthcare.model.User;

public class UserService {
private UserDAO userDAO;
	
	public UserService(){
		userDAO = new UserDAO();
	}
	
	public User getUser(int userId){
		User user = userDAO.getUser(userId);
		return user;
	}
	
	public User saveUser(User user){
		return userDAO.saveUser(user);
	}
	
	public User loginUser(String email, String password){
		return userDAO.login(email, password);
	}
	
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

}
