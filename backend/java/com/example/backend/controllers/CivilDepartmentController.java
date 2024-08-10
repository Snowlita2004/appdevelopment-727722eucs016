
package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend.models.CivilDepartment;
import com.example.backend.services.CivilDepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/civil-departments")
public class CivilDepartmentController {

    @Autowired
    private CivilDepartmentService service;

    @GetMapping
    public List<CivilDepartment> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public CivilDepartment getDepartmentById(@PathVariable Long id) {
        return service.getDepartmentById(id);
    }

    @PostMapping
    public CivilDepartment saveDepartment(@RequestBody CivilDepartment department) {
        return service.saveDepartment(department);
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        service.deleteDepartment(id);
    }
}