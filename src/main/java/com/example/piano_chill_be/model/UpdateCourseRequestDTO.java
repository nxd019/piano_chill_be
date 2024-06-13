package com.example.piano_chill_be.model;


import lombok.Data;

@Data
public class UpdateCourseRequestDTO {
    private String idCourse;

    private String name;

    private String content;

    private String time;

    private String price;
}
