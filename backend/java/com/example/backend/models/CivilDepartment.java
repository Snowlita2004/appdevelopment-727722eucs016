
package com.example.backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CivilDepartment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String jobZone;
    private String details;
    private String courseInfo;
    private String careerProgression;
    private String passRegulation;
    private String jobRoles;
    private String subjects;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getJobZone() {
        return jobZone;
    }
    public void setJobZone(String jobZone) {
        this.jobZone = jobZone;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getCourseInfo() {
        return courseInfo;
    }
    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }
    public String getCareerProgression() {
        return careerProgression;
    }
    public void setCareerProgression(String careerProgression) {
        this.careerProgression = careerProgression;
    }
    public String getPassRegulation() {
        return passRegulation;
    }
    public void setPassRegulation(String passRegulation) {
        this.passRegulation = passRegulation;
    }
    public String getJobRoles() {
        return jobRoles;
    }
    public void setJobRoles(String jobRoles) {
        this.jobRoles = jobRoles;
    }
    public String getSubjects() {
        return subjects;
    }
    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

     
}