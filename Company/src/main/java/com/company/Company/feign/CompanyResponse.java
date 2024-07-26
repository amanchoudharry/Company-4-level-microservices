package com.company.Company.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class CompanyResponse {
    private Long id;
    private String name;
    private List<VerticalResponse> verticals;
}
