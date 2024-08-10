package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.models.IndoorStadium;
import com.example.backend.repositories.IndoorStadiumRepository;

import java.util.List;

@Service
public class IndoorStadiumService {

    @Autowired
    private IndoorStadiumRepository indoorStadiumRepository;

    public List<IndoorStadium> getAllIndoorStadiums() {
        return indoorStadiumRepository.findAll();
    }

    public IndoorStadium getIndoorStadiumById(Long id) {
        return indoorStadiumRepository.findById(id).orElse(null);
    }

    public IndoorStadium saveIndoorStadium(IndoorStadium indoorStadium) {
        return indoorStadiumRepository.save(indoorStadium);
    }

    public void deleteIndoorStadium(Long id) {
        indoorStadiumRepository.deleteById(id);
    }
}