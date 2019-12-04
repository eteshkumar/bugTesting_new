package com.iris.daos;

import java.util.List;

import com.iris.models.Project;
import com.iris.models.User;

public interface UserDao {
	public User validate(int userid,String password);
	public List<User> getAllDeveloper();
	public List<User> getAllTesterI();
	public User getUserById(int userId);
	
}
