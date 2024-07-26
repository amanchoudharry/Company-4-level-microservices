package com.company.Employee.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "companyemployee")
public class Employee {
    @Id
    private Long id;
    private String name;
    private String position;
    private String department;
    private double salary;
    private Long projectId;
}