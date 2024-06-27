package com.example.piano_chill_be.model.teacher;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTeacherRequestDTO {

    private Long lecturerId;


    private String username;

    private String password;

    private String role;

    private String lecturerName;

    private String dob;

    private String gender;

    private String email;

    private String phone;

    private double salary;

}
