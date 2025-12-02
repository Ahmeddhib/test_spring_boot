<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.restControllers;


import com.test_spring_boot.test_spring_boot.entities.Project;
import com.test_spring_boot.test_spring_boot.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("/project")
public class ProjectRestController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(path= "all" , method = RequestMethod.GET)
    public List<Project> findAllProjects(){
        return projectService.findAllProjects();
    }

    @RequestMapping(path = "addProject", method = RequestMethod.POST)
    public Project saveProject(Project project){
        return projectService.saveProject(project);
    }

    @RequestMapping(path = "getProject/{id}", method = RequestMethod.GET)
    public Project findProjectById(Long id){
        return projectService.findProjectById(id);
    }

    @RequestMapping(path = "updateProject", method = RequestMethod.PUT)
    public Project updateProject(Project project){
        return projectService.updateProject(project);
    }

    @RequestMapping(path = "deleteProject/{id}", method = RequestMethod.DELETE)
    public void deleteProjectById(Long id){
        projectService.deleteProjectById(id);
    }




}
=======
package com.test_spring_boot.test_spring_boot.restControllers;


import com.test_spring_boot.test_spring_boot.entities.Project;
import com.test_spring_boot.test_spring_boot.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("/project")
public class ProjectRestController {

    @Autowired
    ProjectService projectService;

    @RequestMapping(path= "all" , method = RequestMethod.GET)
    public List<Project> findAllProjects(){
        return projectService.findAllProjects();
    }

    @RequestMapping(path = "addProject", method = RequestMethod.POST)
    public Project saveProject(Project project){
        return projectService.saveProject(project);
    }

    @RequestMapping(path = "getProject/{id}", method = RequestMethod.GET)
    public Project findProjectById(Long id){
        return projectService.findProjectById(id);
    }

    @RequestMapping(path = "updateProject", method = RequestMethod.PUT)
    public Project updateProject(Project project){
        return projectService.updateProject(project);
    }

    @RequestMapping(path = "deleteProject/{id}", method = RequestMethod.DELETE)
    public void deleteProjectById(Long id){
        projectService.deleteProjectById(id);
    }




}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
