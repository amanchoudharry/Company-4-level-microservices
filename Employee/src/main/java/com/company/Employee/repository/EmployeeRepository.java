package com.company.Employee.repository;
import com.company.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByProjectId(Long projectId);
}
