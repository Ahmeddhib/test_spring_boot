package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.Task;

import java.util.List;

public interface TaskService {

    Task saveTask(Task task);

    List<Task> findAllTasks();

    Task findTaskById(Long id);

    Task updateTaskById(Task task);

    void deleteTaskById(Long id);
}
