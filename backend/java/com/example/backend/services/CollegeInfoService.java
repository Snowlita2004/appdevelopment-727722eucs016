
package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.CollegeInfo;
import com.example.backend.repositories.CollegeInfoRepository;

@Service
public class CollegeInfoService {

    @Autowired
    private CollegeInfoRepository collegeInfoRepository;

    public CollegeInfo getCollegeInfo() {
        return collegeInfoRepository.findById(1L).orElse(null); // Assume only one entry for simplicity
    }
}