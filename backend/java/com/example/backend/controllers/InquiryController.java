 // src/main/java/com/example/backend/controllers/InquiryController.java
package com.example.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.backend.models.Inquiry;

@RestController
 
@RequestMapping("/api/inquiries/old")
public class InquiryController {

    @GetMapping
    public List<Inquiry> getAllInquiries() {
        return com.example.backend.services.InquiryService.getAllInquiries();
    }
}