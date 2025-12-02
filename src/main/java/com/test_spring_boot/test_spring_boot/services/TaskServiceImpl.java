<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.TaskRepository;
import com.test_spring_boot.test_spring_boot.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public Task updateTaskById(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);

    }


}
=======
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.TaskRepository;
import com.test_spring_boot.test_spring_boot.entities.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task findTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public Task updateTaskById(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTaskById(Long id) {
        taskRepository.deleteById(id);

    }


}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
