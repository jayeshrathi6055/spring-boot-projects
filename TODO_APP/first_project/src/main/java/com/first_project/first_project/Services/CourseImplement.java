package com.first_project.first_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first_project.first_project.Entities.Courses;
import com.first_project.first_project.dao.CourseDao;

@Service
public class CourseImplement implements CourseInterface {
    @Autowired
    private CourseDao courseDao;
    public CourseImplement(){

    }

    @Override
    public List<Courses> getCourses(){
        return courseDao.findAll();
    }

    public Courses getCourse(long id){
        return courseDao.getOne(id);
    }

    public Courses postCourse(Courses n){
        return courseDao.save(n);
    }
    public Courses updateCourse(Courses n){
        return courseDao.save(n);
    }
    public void deleteCourse(long id){
        Courses entity = courseDao.getOne(id);
        courseDao.delete(entity);
    }
}
