package com.iris.service;

import java.util.List;

import com.iris.models.User;

public interface UserService {
	public User validate(int userid,String password);
	public List<User> getAllDeveloper();
	public List<User> getAllTesterI();
	public User getUserById(int userId);
	

}
