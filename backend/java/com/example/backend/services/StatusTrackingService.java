
// src/main/java/com/example/inquiry/InquiryService.java
package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.Inquiry;
import com.example.backend.repositories.InquiryRepository;

import java.util.List;

@Service
public class StatusTrackingService {

    @Autowired
    private InquiryRepository inquiryRepository;

    public List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll();
    }
}