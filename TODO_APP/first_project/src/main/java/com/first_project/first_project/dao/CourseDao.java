package com.first_project.first_project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.first_project.first_project.Entities.Courses;

public interface CourseDao extends JpaRepository<Courses,Long>{
    
}
