package com.company.Vertical.repository;

import com.company.Vertical.model.Vertical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VerticalRepository extends JpaRepository<Vertical,Long> {
    List<Vertical> findByCompanyId(Long companyId);
}
