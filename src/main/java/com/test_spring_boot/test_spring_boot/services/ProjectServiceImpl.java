<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.ProjectRepository;
import com.test_spring_boot.test_spring_boot.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project findProjectById(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
       public List<Project> findAllProjects() {
            return projectRepository.findAll();
    }

    @Override
    public Project updateProject( Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);

    }
}
=======
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.ProjectRepository;
import com.test_spring_boot.test_spring_boot.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project findProjectById(Long id) {
        return projectRepository.findById(id).get();
    }

    @Override
       public List<Project> findAllProjects() {
            return projectRepository.findAll();
    }

    @Override
    public Project updateProject( Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);

    }
}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
