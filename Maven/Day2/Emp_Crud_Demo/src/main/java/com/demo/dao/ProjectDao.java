package com.demo.dao;

import java.util.List;

import com.demo.beans.Project;

public interface ProjectDao {

	

	boolean delete(Project p);

	
	Project FindById(int pid);


	List<Project> getAllProjects();

}
