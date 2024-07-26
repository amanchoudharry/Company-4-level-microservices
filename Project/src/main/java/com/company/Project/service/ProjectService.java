package com.company.Project.service;

import com.company.Project.feign.Employee;
import com.company.Project.feign.EmployeeClient;
import com.company.Project.feign.ProjectResponse;
import com.company.Project.model.Project;
import com.company.Project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private EmployeeClient employeeClient;

    public List<ProjectResponse> getProjectsByVerticalId(Long verticalId) {
        List<Project> projects = projectRepository.findByVerticalId(verticalId);
        return projects.stream().map(project -> {
            ProjectResponse response = new ProjectResponse();
            response.setId(project.getId());
            response.setName(project.getName());
            List<Employee> employees = employeeClient.getEmployeesByProjectId(project.getId());
            response.setEmployees(employees);
            return response;
        }).collect(Collectors.toList());
    }

    public List<Project> addProjects(List<Project> projects) {
        return projectRepository.saveAll(projects);
    }
}