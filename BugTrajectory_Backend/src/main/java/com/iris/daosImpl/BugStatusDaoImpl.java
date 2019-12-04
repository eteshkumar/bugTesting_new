package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.BugStatusDao;
import com.iris.models.BugStatus;
import com.iris.models.Project;

@Repository("bugStatusDao")
public class BugStatusDaoImpl implements BugStatusDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<BugStatus> getAllBugStatus() {
		try {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.BugStatus");
		List<BugStatus> bugStatusList=q.list();
		return bugStatusList;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;

}
}
