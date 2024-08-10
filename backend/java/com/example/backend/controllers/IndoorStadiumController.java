
package com.example.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.backend.models.IndoorStadium;
import com.example.backend.services.IndoorStadiumService;

import java.util.List;

@RestController
@RequestMapping("/api/indoor-stadiums")
public class IndoorStadiumController {

    @Autowired
    private IndoorStadiumService indoorStadiumService;

    @GetMapping
    public List<IndoorStadium> getAllIndoorStadiums() {
        return indoorStadiumService.getAllIndoorStadiums();
    }

    @GetMapping("/{id}")
    public IndoorStadium getIndoorStadiumById(@PathVariable Long id) {
        return indoorStadiumService.getIndoorStadiumById(id);
    }

    @PostMapping
    public IndoorStadium createIndoorStadium(@RequestBody IndoorStadium indoorStadium) {
        return indoorStadiumService.saveIndoorStadium(indoorStadium);
    }

    @DeleteMapping("/{id}")
    public void deleteIndoorStadium(@PathVariable Long id) {
        indoorStadiumService.deleteIndoorStadium(id);
    }
}