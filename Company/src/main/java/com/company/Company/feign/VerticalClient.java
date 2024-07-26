package com.company.Company.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "vertical",url = "http://localhost:1232")
public interface VerticalClient {
    @GetMapping("/verticals/company/{companyId}")
    List<VerticalResponse> getVerticalsByCompanyId(@PathVariable("companyId") Long companyId);
}