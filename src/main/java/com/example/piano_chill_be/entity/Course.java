package com.example.piano_chill_be.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @Column 
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

    @Column(name = "img")
    private byte[] img;
}
