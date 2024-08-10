 // src/main/java/com/example/reports/StudentReportsController.java
package com.example.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.StudentReport;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentReportsController {

    @GetMapping("/studentreports")
    public List<StudentReport> getStudentReports() {
        // Example data for demonstration
        return Arrays.asList(
            new StudentReport("Sarah Johnson", "$90,000", "Los Angeles", "Tech Solutions Inc.", 2),
            new StudentReport("Michael Brown", "$85,000", "Chicago", "Web Co.", 1),
            new StudentReport("Emily Davis", "$95,000", "San Francisco", "Data Systems Ltd.", 3),
            new StudentReport("David Wilson", "$80,000", "Boston", "Software Innovations", 2),
            new StudentReport("Amy Martinez", "$88,000", "Miami", "Network Solutions", 2)
            // Add more entries as needed
        );
    }
}