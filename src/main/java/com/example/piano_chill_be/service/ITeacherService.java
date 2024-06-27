package com.example.piano_chill_be.service;

import com.example.piano_chill_be.entity.Teacher;
import com.example.piano_chill_be.model.teacher.CreateTeacherRequestDTO;

public interface ITeacherService {

    Teacher createTeacher(CreateTeacherRequestDTO createteacher);
}
