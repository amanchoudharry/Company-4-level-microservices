package com.company.Vertical.service;

import com.company.Vertical.feign.ProjectClient;
import com.company.Vertical.feign.ProjectResponse;
import com.company.Vertical.feign.VerticalResponse;
import com.company.Vertical.model.Vertical;
import com.company.Vertical.repository.VerticalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VerticalService {

    @Autowired
    private VerticalRepository verticalRepository;

    @Autowired
    private ProjectClient projectClient;

    public List<VerticalResponse> getVerticalsByCompanyId(Long companyId) {
        List<Vertical> verticals = verticalRepository.findByCompanyId(companyId);
        return verticals.stream().map(vertical -> {
            VerticalResponse response = new VerticalResponse();
            response.setId(vertical.getId());
            response.setName(vertical.getName());
            List<ProjectResponse> projects = projectClient.getProjectsByVerticalId(vertical.getId());
            response.setProjects(projects);
            return response;
        }).collect(Collectors.toList());
    }

    public List<Vertical> addVerticals(List<Vertical> verticals) {
        return verticalRepository.saveAll(verticals);
    }
}
