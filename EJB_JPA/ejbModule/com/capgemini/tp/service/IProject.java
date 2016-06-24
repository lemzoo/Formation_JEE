package com.capgemini.tp.service;

import java.util.List;

import javax.ejb.Remote;

import com.capgemini.tp.entity.Project;

@Remote
public interface IProject {
	void saveProject(Project project);
    Project findProject(Project project);
    List<Project> retrieveAllProjects();
}
