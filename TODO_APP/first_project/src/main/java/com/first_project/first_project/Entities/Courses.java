package com.first_project.first_project.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Courses {
    // Database Variables
    @Id
    private long id;
    private String title;
    private String description;

    // Default Constructor
    public Courses(){}

    // Parameterized Constructor
    public Courses(long id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public long getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
