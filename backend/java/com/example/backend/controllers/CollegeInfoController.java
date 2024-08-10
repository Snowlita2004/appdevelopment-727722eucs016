
package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.CollegeInfo;
import com.example.backend.services.CollegeInfoService;

@RestController
@RequestMapping("/api/collegeinfo")
public class CollegeInfoController {

    @Autowired
    private CollegeInfoService collegeInfoService;

    @GetMapping
    public CollegeInfo getCollegeInfo() {
        return collegeInfoService.getCollegeInfo();
    }
}