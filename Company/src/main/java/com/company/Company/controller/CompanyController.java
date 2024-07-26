package com.company.Company.controller;

import com.company.Company.feign.CompanyResponse;
import com.company.Company.model.Company;
import com.company.Company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/addcompanies")
    public List<Company> addCompanies(@RequestBody List<Company> companies) {
        return companyService.addCompanies(companies);
    }

    @GetMapping("/{id}/hierarchy")
    public CompanyResponse getCompanyHierarchy(@PathVariable Long id) {
        return companyService.getCompanyHierarchy(id);
    }
}