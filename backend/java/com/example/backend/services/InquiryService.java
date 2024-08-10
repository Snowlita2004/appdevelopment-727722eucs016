package com.example.backend.services;

import com.example.backend.models.Inquiry;
import com.example.backend.repositories.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquiryService {

    @Autowired
    private static InquiryRepository inquiryRepository;

    public static List<Inquiry> getAllInquiries() {
        return inquiryRepository.findAll();
    }

    public Optional<Inquiry> getInquiryById(Long id) {
        return inquiryRepository.findById(id);
    }

    public Inquiry saveInquiry(Inquiry inquiry) {
        return inquiryRepository.save(inquiry);
    }

    public void deleteInquiry(Long id) {
        inquiryRepository.deleteById(id);
    }
}