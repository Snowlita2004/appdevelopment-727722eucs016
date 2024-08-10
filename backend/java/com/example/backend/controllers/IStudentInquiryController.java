package com.example.backend.controllers;

import com.example.backend.models.Inquiry;
import com.example.backend.repositories.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
 
@RequestMapping("/api/inquiries/students")
public class IStudentInquiryController {

    @Autowired
    private InquiryRepository inquiryRepository;

    @GetMapping
    public List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll();
    }
}