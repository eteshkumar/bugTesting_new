package com.iris.service;

import java.util.List;

import com.iris.models.Project;

public interface ProjectService {
	public List<Project> getAllProject();
	public Project getProjectById(int project);
	public boolean updateProject(Project pObj);
	

}
