package com.iris.daos;

import java.util.List;

import com.iris.models.Project;

public interface ProjectDao {
	public List<Project> getAllProject();
	public Project getProjectById(int projectId);
	public boolean updateProject(Project pObj);


}
