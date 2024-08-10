
package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.CivilDepartment;
import com.example.backend.repositories.CivilDepartmentRepository;

import java.util.List;

@Service
public class CivilDepartmentService {

    @Autowired
    private CivilDepartmentRepository repository;

    public List<CivilDepartment> getAllDepartments() {
        return repository.findAll();
    }

    public CivilDepartment getDepartmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public CivilDepartment saveDepartment(CivilDepartment department) {
        return repository.save(department);
    }

    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }
}