 // src/main/java/com/example/inquiry/InquiryController.java
package com.example.backend.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.Inquiry;
import com.example.backend.services.InquiryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StatusTrackingController {

    @GetMapping("/inquiries/status")
    public List<Inquiry> getInquiries() {
        return InquiryService.getAllInquiries();
    }
}