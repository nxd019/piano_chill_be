package com.example.piano_chill_be.service;


import com.example.piano_chill_be.database.CourseRepository;
import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.model.CreateCourseRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
