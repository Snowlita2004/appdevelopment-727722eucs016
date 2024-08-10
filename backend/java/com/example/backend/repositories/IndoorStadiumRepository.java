package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.models.IndoorStadium;

@Repository
public interface IndoorStadiumRepository extends JpaRepository<IndoorStadium, Long> {
}