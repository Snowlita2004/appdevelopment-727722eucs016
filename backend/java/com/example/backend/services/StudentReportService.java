
package com.example.backend.services;

import com.example.backend.models.StudentReport;
import com.example.backend.repositories.StudentReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentReportService {

    @Autowired
    private StudentReportRepository studentReportRepository;

    // Method to save a student report
    public void saveStudentReport(StudentReport studentReport) {
        studentReportRepository.save(studentReport);
    }

    // Method to get all student reports
    public List<StudentReport> getAllStudentReports() {
        return studentReportRepository.findAll();
    }

    // Method to find a student report by name
    public StudentReport getStudentReportByName(String name) {
        return studentReportRepository.findByName(name);
    }
}