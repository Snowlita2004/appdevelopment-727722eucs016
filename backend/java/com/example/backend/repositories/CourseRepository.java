package com.example.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}