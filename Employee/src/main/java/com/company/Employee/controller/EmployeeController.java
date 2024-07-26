package com.company.Employee.controller;

import com.company.Employee.model.Employee;
import com.company.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addProjects")
    public List<Employee> addProjects(@RequestBody List<Employee> employees) {
        return employeeService.addProjects(employees);
    }

    @GetMapping("/project/{projectId}")
    public List<Employee> getEmployeesByProjectId(@PathVariable Long projectId) {
        return employeeService.getEmployeesByProjectId(projectId);
    }
}