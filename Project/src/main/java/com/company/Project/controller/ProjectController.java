package com.company.Project.controller;

import com.company.Project.feign.ProjectResponse;
import com.company.Project.model.Project;
import com.company.Project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/addprojects")
    public List<Project> addProjects(@RequestBody  List<Project> projects) {
        return projectService.addProjects(projects);
    }

    @GetMapping("/vertical/{verticalId}")
    public List<ProjectResponse> getProjectsByVerticalId(@PathVariable Long verticalId) {
        return projectService.getProjectsByVerticalId(verticalId);
    }
}