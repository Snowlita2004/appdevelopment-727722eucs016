
package com.example.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.FoodCourtInfo;

@RestController
@RequestMapping("/api/foodcourt")
public class FoodcourtController {

    @GetMapping("/info")
    public FoodCourtInfo getFoodCourtInfo() {
        // Static data for demonstration; consider fetching from a database if needed
        String[] details = {
            "A food court is a common area within a shopping mall, airport, or other large facility where various food vendors operate stalls or booths, typically selling a variety of food items.",
            "Food courts are popular because they offer a wide range of food options in one convenient location, making it easy for people to find something they like to eat.",
            "They often feature a mix of fast food, casual dining, and specialty food vendors, catering to different tastes and preferences.",
            "Food courts usually have seating areas where customers can sit and enjoy their meals.",
            "The layout and design of food courts can vary widely, ranging from simple and functional to elaborate and themed.",
            "Some food courts may also include entertainment options or activities to enhance the dining experience.",
            "Overall, food courts provide a convenient and diverse dining experience for people in busy locations, offering a wide range of food options in one place."
        };

        FoodCourtInfo info = new FoodCourtInfo(
            "https://marketplace.canva.com/EAE9xsH_sKM/1/0/1600w/canva-black-white-minimalist-food-photo-collage--IrKlYuedFE.jpg",
            "About Our Food Court",
            details
        );

        return info;
    }
}