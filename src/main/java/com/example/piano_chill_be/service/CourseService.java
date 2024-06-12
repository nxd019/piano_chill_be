package com.example.piano_chill_be.service;


import com.example.piano_chill_be.Impl.CourseServiceIMpl;
import com.example.piano_chill_be.database.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService  implements CourseServiceIMpl {

    @Autowired
    CourseRepository courseRepository;
}
