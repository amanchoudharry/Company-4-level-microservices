package com.company.Vertical.controller;

import com.company.Vertical.feign.VerticalResponse;
import com.company.Vertical.model.Vertical;
import com.company.Vertical.service.VerticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/verticals")
public class VerticalController {

    @Autowired
    private VerticalService verticalService;

    @PostMapping("/addverticals")
    public List<Vertical> addVerticals(@RequestBody List<Vertical> verticals) {
        return verticalService.addVerticals(verticals);
    }

    @GetMapping("/company/{companyId}")
    public List<VerticalResponse> getVerticalsByCompanyId(@PathVariable Long companyId) {
        return verticalService.getVerticalsByCompanyId(companyId);
    }
}