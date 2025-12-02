<<<<<<< HEAD
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
=======
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
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
