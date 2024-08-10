
package com.example.backend.controllers;

import com.example.backend.models.Inquiry;
import com.example.backend.services.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private InquiryService inquiryService;
 public List<Inquiry> getAllInquiries() {
        return InquiryService.getAllInquiries();
    }

    @PostMapping
    public Inquiry createInquiry(@RequestBody Inquiry inquiry) {
        return inquiryService.saveInquiry(inquiry);
    }
}