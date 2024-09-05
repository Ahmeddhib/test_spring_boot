package com.test_spring_boot.test_spring_boot.restControllers;

import com.test_spring_boot.test_spring_boot.entities.Task;
import com.test_spring_boot.test_spring_boot.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("/task")
public class TaskRestController {

    @Autowired
    TaskService taskService;

    @RequestMapping(path = "allTasks", method = RequestMethod.GET)
    public List<Task> findAllTasks(){
        return taskService.findAllTasks();
    }

    @RequestMapping(path = "addTask", method = RequestMethod.POST)
    public Task saveTask(Task task){
        return taskService.saveTask(task);
    }

    @RequestMapping(path = "getTask/{id}", method = RequestMethod.GET)
    public Task findTaskById(Long id){
        return taskService.findTaskById(id);
    }

    @RequestMapping(path = "updateTask", method = RequestMethod.PUT)
    public Task updateTask(Task task){
        return taskService.updateTaskById(task);
    }

    @RequestMapping(path = "deleteTask/{id}", method = RequestMethod.DELETE)
    public void deleteTaskById(Long id){
        taskService.deleteTaskById(id);
    }








}
