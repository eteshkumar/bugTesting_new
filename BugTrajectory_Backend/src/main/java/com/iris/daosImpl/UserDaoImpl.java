package com.iris.daosImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.UserDao;
import com.iris.models.Project;
import com.iris.models.User;

@Repository("userDao")

public class UserDaoImpl implements UserDao {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public User validate(int userid, String password) {
		
		try {
			Session session=sessionFactory.getCurrentSession();
			User uObj=session.get(User.class,userid);
			
			if(uObj!=null) {
				if(uObj.getPassword().equals(password)) {
					return uObj;
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public List<User> getAllDeveloper() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.User where designation='Developer'");
		List<User> developerList=q.list();
		return developerList;
	}


	public List<User> getAllTesterI() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.User where designation='Tester'");
		List<User> testerList=q.list();
		return testerList;
	}

	
	public User getUserById(int userId) {
		try {
		Session session=sessionFactory.getCurrentSession();
		User userObj=session.get(User.class, userId);
		return userObj;
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	}


	
				
			
			
		
		
	
	


