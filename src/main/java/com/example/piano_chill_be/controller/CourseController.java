package com.example.piano_chill_be.controller;


import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.course.CreateCourseRequestDTO;
import com.example.piano_chill_be.model.course.UpdateCourseRequestDTO;
import com.example.piano_chill_be.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/admin/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/create")
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

    @DeleteMapping("delete/{id}")
    public Course deleteCourse(@PathVariable("id") Long id) {
        return courseService.deleteCourse(id);
    }








}
