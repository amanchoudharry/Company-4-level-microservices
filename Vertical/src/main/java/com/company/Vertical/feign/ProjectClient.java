package com.company.Vertical.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "project",url = "http://localhost:1233")
public interface ProjectClient {
    @GetMapping("/projects/vertical/{verticalId}")
    List<ProjectResponse> getProjectsByVerticalId(@PathVariable("verticalId") Long verticalId);
}