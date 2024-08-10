
package com.example.backend.repositories;

import com.example.backend.models.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Inquiry, Long> {
}