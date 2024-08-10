 // src/main/java/com/example/library/LibraryInfo.java
package com.example.backend.models;

public class LibraryInfo {
    private String description;
    private String[] keyAspects;

    // Constructor
    public LibraryInfo(String description, String[] keyAspects) {
        this.description = description;
        this.keyAspects = keyAspects;
    }

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getKeyAspects() {
        return keyAspects;
    }

    public void setKeyAspects(String[] keyAspects) {
        this.keyAspects = keyAspects;
    }
}