package com.example.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.FooterInfo;

@RestController
@RequestMapping("/api/footer")
public class FooterController {

    @GetMapping("/info")
    public FooterInfo getFooterInfo() {
        // Static data for demonstration; consider fetching from a database if needed
        return new FooterInfo(
            "Copyright © 2024 National College Of Technology (NCT)",
            "https://wa.me/+919578181025",
            "Founded By Team Dhanush"
        );
    }
}