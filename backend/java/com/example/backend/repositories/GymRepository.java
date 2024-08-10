package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Gym;

public interface GymRepository extends JpaRepository<Gym, Long> {
}