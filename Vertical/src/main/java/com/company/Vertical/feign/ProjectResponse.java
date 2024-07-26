package com.company.Vertical.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProjectResponse {

    private Long id;
    private String name;
    private List<Employee> employees;
}
