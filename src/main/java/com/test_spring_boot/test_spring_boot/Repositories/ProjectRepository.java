package com.test_spring_boot.test_spring_boot.Repositories;

import com.test_spring_boot.test_spring_boot.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
