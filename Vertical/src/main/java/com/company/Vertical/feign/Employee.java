package com.company.Vertical.feign;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long id;
    private String name;
    private String position;
    private String department;
    private double salary;
    private Long projectId;
}
