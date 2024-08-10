
package com.example.backend.repositories;

import com.example.backend.models.StudentReport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentReportRepository {

    private List<StudentReport> studentReports = new ArrayList<>();

    // Method to add a student report
    public void save(StudentReport studentReport) {
        studentReports.add(studentReport);
    }

    // Method to get all student reports
    public List<StudentReport> findAll() {
        return new ArrayList<>(studentReports);
    }

    // Method to find a student report by name
    public StudentReport findByName(String name) {
        return studentReports.stream()
                .filter(report -> report.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}