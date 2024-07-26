package com.company.Project.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

@FeignClient(name = "employee", url ="http://localhost:1234")
public interface EmployeeClient {
    @GetMapping("/employees/project/{projectId}")
    List<Employee> getEmployeesByProjectId(@PathVariable("projectId") Long projectId);
}