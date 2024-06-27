package com.example.piano_chill_be.model.course;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CreateCourseRequestDTO {

    private String idCourse;

    private String name;

    private String content;

    private String time;

    private String price;
}
