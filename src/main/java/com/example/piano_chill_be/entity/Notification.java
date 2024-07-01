package com.example.piano_chill_be.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "notificaion")
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    @Column(name = "receiver")
    private String receceiver;
}
