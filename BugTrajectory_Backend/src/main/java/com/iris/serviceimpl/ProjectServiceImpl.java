package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.ProjectDao;
import com.iris.models.Project;
import com.iris.service.ProjectService;

@Service("projectService")
@Transactional

public class ProjectServiceImpl  implements ProjectService{
	
	@Autowired
	ProjectDao projectDao;


	public List<Project> getAllProject() {
	
		return projectDao.getAllProject();
	}


	public Project getProjectById(int projectId) {
		return projectDao.getProjectById(projectId);
	}

	
	public boolean updateProject(Project pObj) {
		return projectDao.updateProject(pObj);
	}
	

}
