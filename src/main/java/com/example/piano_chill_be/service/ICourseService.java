package com.example.piano_chill_be.service;

import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.CreateCourseRequestDTO;

public interface ICourseService {

    Course createCourse(CreateCourseRequestDTO createCourse);
}
