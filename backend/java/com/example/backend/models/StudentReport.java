
// src/main/java/com/example/reports/StudentReport.java
package com.example.backend.models;

public class StudentReport {
    private String name;
    private String packageAmount;
    private String place;
    private String company;
    private int yearsOfExperience;

    // Constructor
    public StudentReport(String name, String packageAmount, String place, String company, int yearsOfExperience) {
        this.name = name;
        this.packageAmount = packageAmount;
        this.place = place;
        this.company = company;
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageAmount() {
        return packageAmount;
    }

    public void setPackageAmount(String packageAmount) {
        this.packageAmount = packageAmount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}