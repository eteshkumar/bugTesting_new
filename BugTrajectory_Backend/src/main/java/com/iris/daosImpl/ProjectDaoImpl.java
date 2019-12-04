package com.iris.daosImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.ProjectDao;
import com.iris.models.Project;


@Repository("projectDao")

public class ProjectDaoImpl implements ProjectDao {
	
	@Autowired
	SessionFactory sessionFactory;


	public List<Project> getAllProject() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.Project");
		List<Project> ProjectList=q.list();
		return ProjectList;


}

	
	public Project getProjectById(int projectId) {
		try {
		Session session=sessionFactory.getCurrentSession();
		Project pObj=session.get(Project.class,projectId);
		return pObj;
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
}


	
	public boolean updateProject(Project pObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.update(pObj);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
}
