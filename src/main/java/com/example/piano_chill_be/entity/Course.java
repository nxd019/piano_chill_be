package com.example.piano_chill_be.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "idCourse")
    private String idCourse;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @Column(name = "time")
    private String time;

    @Column(name = "price")
    private String price;
}
