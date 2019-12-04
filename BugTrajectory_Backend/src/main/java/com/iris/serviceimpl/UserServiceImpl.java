package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.UserDao;
import com.iris.models.User;
import com.iris.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;


	public User validate(int userid, String password) {
		
		return userDao.validate(userid, password);
	}

	public List<User> getAllDeveloper() {
		// TODO Auto-generated method stub
		return userDao.getAllDeveloper();
	}

	public List<User> getAllTesterI() {
		// TODO Auto-generated method stub
		return userDao.getAllTesterI();
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return userDao.getUserById(userId);
	}
	

}
