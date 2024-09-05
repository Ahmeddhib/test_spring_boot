package com.test_spring_boot.test_spring_boot.Repositories;

import com.test_spring_boot.test_spring_boot.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
