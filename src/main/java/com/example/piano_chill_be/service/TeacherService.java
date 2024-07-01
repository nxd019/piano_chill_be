package com.example.piano_chill_be.service;


import com.example.piano_chill_be.database.TeacherRepository;
import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.entity.Teacher;
import com.example.piano_chill_be.model.teacher.CreateTeacherRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements ITeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher createTeacher(CreateTeacherRequestDTO createteacher) {
        Teacher newTeacher = new Teacher();
        newTeacher.setLecturerId(createteacher.getLecturerId());
        newTeacher.setUsername(createteacher.getUsername());
        newTeacher.setPassword(createteacher.getPassword());
        newTeacher.setRole(createteacher.getRole());
        newTeacher.setLecturerName(createteacher.getLecturerName());
        newTeacher.setDob(createteacher.getDob());
        newTeacher.setGender(createteacher.getGender());
        newTeacher.setEmail(createteacher.getEmail());
        newTeacher.setPhone(createteacher.getPhone());
        newTeacher.setSalary(createteacher.getSalary());
        newTeacher = teacherRepository.save(newTeacher);
        return newTeacher;
    }

    @Override
    public List<Teacher> teachesList() {
        List<Teacher> teachesList = teacherRepository.findAll();
        return teachesList;
    }
}
