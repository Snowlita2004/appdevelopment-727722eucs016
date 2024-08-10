package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.Gym;
import com.example.backend.services.GymService;

import java.util.List;

@RestController
@RequestMapping("/api/gyms")
public class GymController {
    @Autowired
    private GymService gymService;

    @GetMapping
    public ResponseEntity<List<Gym>> getAllGyms() {
        List<Gym> gyms = gymService.getAllGyms();
        return new ResponseEntity<>(gyms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Gym> getGymById(@PathVariable Long id) {
        return gymService.getGymById(id)
                .map(gym -> new ResponseEntity<>(gym, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}