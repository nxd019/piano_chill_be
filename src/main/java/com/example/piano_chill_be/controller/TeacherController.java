package com.example.piano_chill_be.controller;
import com.example.piano_chill_be.entity.Teacher;
import com.example.piano_chill_be.model.teacher.CreateTeacherRequestDTO;
import com.example.piano_chill_be.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/admin/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/createTeacher")
    public Teacher createTeacher(@RequestBody CreateTeacherRequestDTO createteacher) {
        return teacherService.createTeacher(createteacher);
    }
}
