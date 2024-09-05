package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.Project;

import java.util.List;

public interface ProjectService {

   Project saveProject(Project project);
    Project findProjectById(Long id);

    List<Project> findAllProjects();

    Project updateProject( Project project);

    void deleteProjectById(Long id);

}
