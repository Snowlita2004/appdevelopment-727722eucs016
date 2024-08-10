
package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {
}