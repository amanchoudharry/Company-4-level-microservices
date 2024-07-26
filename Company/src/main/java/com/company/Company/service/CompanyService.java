package com.company.Company.service;

import com.company.Company.feign.CompanyResponse;
import com.company.Company.feign.VerticalClient;
import com.company.Company.feign.VerticalResponse;
import com.company.Company.model.Company;
import com.company.Company.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private VerticalClient verticalClient;

    public CompanyResponse getCompanyHierarchy(Long companyId) {
        Optional<Company> companyOpt = companyRepository.findById(companyId);
        if (companyOpt.isPresent()) {
            Company company = companyOpt.get();
            List<VerticalResponse> verticals = verticalClient.getVerticalsByCompanyId(companyId);
            CompanyResponse response = new CompanyResponse();
            response.setId(company.getId());
            response.setName(company.getName());
            response.setVerticals(verticals);
            return response;
        }
        return null;
    }

    public List<Company> addCompanies(List<Company> companies) {
        return companyRepository.saveAll(companies);
    }
}