 // src/main/java/com/example/inquiry/InquiryRepository.java
package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Inquiry;

public interface StatusTrackingRepository extends JpaRepository<Inquiry, Long> {
}