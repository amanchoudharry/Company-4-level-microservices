package com.company.Project.repository;

import com.company.Project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByVerticalId(Long verticalId);
}
