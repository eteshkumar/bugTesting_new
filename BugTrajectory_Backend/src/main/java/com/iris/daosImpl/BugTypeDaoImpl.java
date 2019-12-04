package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.BugTypeDao;
import com.iris.models.BugType;
import com.iris.models.Project;

@Repository("bugTypeDao")

public class BugTypeDaoImpl implements BugTypeDao {
	@Autowired
	SessionFactory sessionFactory;

	public List<BugType> getAllBug() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from com.iris.models.BugType");
			List<BugType> bugTypeList=q.list();
			return bugTypeList;
		}
		catch(Exception e) {
		e.printStackTrace();
		
		
	}
		return null;

}
}
