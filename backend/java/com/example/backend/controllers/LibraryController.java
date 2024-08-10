 // src/main/java/com/example/library/LibraryController.java
package com.example.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.models.LibraryInfo;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @GetMapping("/libraryinfo")
    public LibraryInfo getLibraryInfo() {
        // Static data for example purposes
        String description = "The library is a vital part of any educational institution, offering a wide range of resources and services to support learning, research, and personal development.";
        String[] keyAspects = {
            "Collection: Libraries house a collection of books, journals, magazines, newspapers, and other materials. The collection may also include electronic resources such as e-books, databases, and online journals.",
            "Cataloging and Classification: To help users locate materials, libraries organize their collections using cataloging and classification systems. The most common system is the Dewey Decimal Classification for books.",
            "Services: Libraries offer various services to their users, such as reference services, circulation services (borrowing and returning materials), interlibrary loan services, and access to computers and the internet.",
            "Study Spaces: Libraries provide quiet study spaces for individuals or group study rooms for collaborative work. Some libraries also offer amenities like cafes and seating areas for relaxation.",
            "Special Collections: Many libraries have special collections that contain rare, valuable, or unique materials. These collections often require special handling and may have restricted access.",
            "Digital Libraries: With the advancement of technology, many libraries now offer digital collections and services, including access to e-books, online databases, and digital archives.",
            "Library Staff: Librarians and library staff play a crucial role in helping users find information, navigate the library's resources, and make the best use of its services."
        };

        return new LibraryInfo(description, keyAspects);
    }
}