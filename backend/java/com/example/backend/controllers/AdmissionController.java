
package com.example.backend.controllers;

import com.example.backend.models.Admission;
import com.example.backend.services.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admissions")
public class AdmissionController {

    @Autowired
    private AdmissionService admissionService;

    @PostMapping
    public Admission createAdmission(@RequestBody Admission admission) {
        return admissionService.save(admission);
    }

    @GetMapping
    public List<Admission> getAllAdmissions() {
        return admissionService.getAllAdmissions();
    }
}