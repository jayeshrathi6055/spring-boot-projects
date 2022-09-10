package com.first_project.first_project.Services;

import java.util.List;
import com.first_project.first_project.Entities.Courses;

public interface CourseInterface {
    public List<Courses> getCourses();
    public Courses getCourse(long id);
    public Courses postCourse(Courses n);
    public Courses updateCourse(Courses n);
    public void deleteCourse(long id);
}
