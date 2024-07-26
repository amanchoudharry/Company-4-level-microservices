package com.company.Employee.service;


import com.company.Employee.model.Employee;
import com.company.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployeesByProjectId(Long projectId) {
        return employeeRepository.findByProjectId(projectId);
    }

    public List<Employee> addProjects(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }
}