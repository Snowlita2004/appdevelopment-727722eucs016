package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.Gym;
import com.example.backend.repositories.GymRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }

    public Optional<Gym> getGymById(Long id) {
        return gymRepository.findById(id);
    }

    public Gym saveGym(Gym gym) {
        return gymRepository.save(gym);
    }
}