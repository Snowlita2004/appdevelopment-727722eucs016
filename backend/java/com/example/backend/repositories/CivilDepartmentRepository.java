package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.models.CivilDepartment;

@Repository
public interface CivilDepartmentRepository extends JpaRepository<CivilDepartment, Long> {
}