package com.example.piano_chill_be.service;


import com.example.piano_chill_be.database.CourseRepository;
import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.CreateCourseRequestDTO;
import com.example.piano_chill_be.model.UpdateCourseRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService  implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course createCourse(CreateCourseRequestDTO createCourse) {
        Course newCourse = new Course();
        newCourse.setIdCourse(createCourse.getIdCourse());
        newCourse.setName(createCourse.getName());
        newCourse.setContent(createCourse.getContent());
        newCourse.setTime(createCourse.getTime());
        newCourse.setPrice(createCourse.getPrice());
        newCourse = courseRepository.save(newCourse);
        return newCourse;
    }

    @Override
    public List<Course> courseList() {
        List<Course> courseList = courseRepository.findAll();
        return courseList;
    }

    @Override
    public Course updateCourse(Long id, UpdateCourseRequestDTO updateCourse) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new ArithmeticException("COURSE NOT EXIST"));
        course.setName(updateCourse.getName());
        course.setContent(updateCourse.getContent());
        course.setPrice(updateCourse.getPrice());
        course.setTime(updateCourse.getTime());
        course = courseRepository.save(course);
        return course;
    }

    @Override
   public Course deleteCourse(Long id) {
        Course course = courseRepository.findById(id).orElseThrow(() -> new ArithmeticException("COURSE NOT EXIST"));
         courseRepository.deleteById(id);
        return course;
    }

}
