package com.example.piano_chill_be.controller;


import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.CreateCourseRequestDTO;
import com.example.piano_chill_be.service.CourseService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestBody CreateCourseRequestDTO createCourse) {
        return courseService.createCourse(createCourse);
    }



}
