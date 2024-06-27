package com.example.piano_chill_be.service;

import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.course.CreateCourseRequestDTO;
import com.example.piano_chill_be.model.course.UpdateCourseRequestDTO;

import java.util.List;

public interface ICourseService {

    Course createCourse(CreateCourseRequestDTO createCourse);

    List<Course> courseList();

    Course updateCourse(Long id,UpdateCourseRequestDTO updateCourse);

    Course deleteCourse(Long id);
}
