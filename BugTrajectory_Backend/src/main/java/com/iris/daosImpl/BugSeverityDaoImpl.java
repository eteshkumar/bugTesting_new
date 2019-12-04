package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.BugSeverityDao;
import com.iris.models.BugSeverity;

@Repository("bugSeverityDao")

public class BugSeverityDaoImpl  implements BugSeverityDao{
	@Autowired
	SessionFactory sessionFactory;

	public List<BugSeverity> getBugSeverity() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from com.iris.models.BugSeverity");
			List<BugSeverity> bugSeverityList=q.list();
			System.out.println("Service Implementation"+bugSeverityList);
			return bugSeverityList;
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
