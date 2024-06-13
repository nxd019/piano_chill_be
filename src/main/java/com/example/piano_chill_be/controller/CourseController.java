package com.example.piano_chill_be.controller;


import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.CreateCourseRequestDTO;
import com.example.piano_chill_be.model.UpdateCourseRequestDTO;
import com.example.piano_chill_be.service.CourseService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestBody CreateCourseRequestDTO createCourse) {
        return courseService.createCourse(createCourse);
    }

    @GetMapping
    public List<Course> courseList() {
        List<Course> courseList = courseService.courseList();
        return courseList;
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable("id") Long id,@RequestBody UpdateCourseRequestDTO updateCourse) {
        return courseService.updateCourse(id, updateCourse);
    }

    @DeleteMapping("/{id}")
    public Course deleteCourse(@PathVariable("id") Long id) {
        return courseService.deleteCourse(id);
    }








}
