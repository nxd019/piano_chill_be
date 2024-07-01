package com.example.piano_chill_be.service;

import com.example.piano_chill_be.entity.Teacher;
import com.example.piano_chill_be.model.teacher.CreateTeacherRequestDTO;

import java.util.List;

public interface ITeacherService {

    Teacher createTeacher(CreateTeacherRequestDTO createteacher);

    List<Teacher> teachesList();
}
