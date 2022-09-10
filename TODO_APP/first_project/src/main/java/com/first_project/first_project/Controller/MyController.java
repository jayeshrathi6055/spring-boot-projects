package com.first_project.first_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first_project.first_project.Services.CourseImplement;
import com.first_project.first_project.Entities.Courses;

@RestController
public class MyController {
    @Autowired
    private CourseImplement courses;

    @GetMapping("/")
    public String home(){
        return "This is home page.";
    }

    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.courses.getCourses();
    }
    
    @GetMapping("/courses/{courseId}")
    public Courses getCourse(@PathVariable String courseId){
        return this.courses.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Courses addCourse(@RequestBody Courses c){
        return this.courses.postCourse(c);
    }

    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses c){
        return this.courses.updateCourse(c);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{

            this.courses.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
