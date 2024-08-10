
package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.CollegeInfo;

public interface CollegeInfoRepository extends JpaRepository<CollegeInfo, Long> {
}