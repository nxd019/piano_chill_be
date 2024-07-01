package com.example.piano_chill_be.controller;

import com.example.piano_chill_be.database.NotificationRepository;
import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.entity.Notification;
import com.example.piano_chill_be.entity.Teacher;
import com.example.piano_chill_be.model.course.CreateCourseRequestDTO;
import com.example.piano_chill_be.model.notification.CreateNotificationRequestDTO;
import com.example.piano_chill_be.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/notification")
@CrossOrigin(origins = "http://localhost:3000")
public class NotificationController {

     @Autowired
     NotificationService notificationService;

    @PostMapping("/create")
    public Notification createNotification(@RequestBody CreateNotificationRequestDTO createNotificationRequestDTOe) {
        return notificationService.createNotification(createNotificationRequestDTOe);
    }

    @GetMapping
    public List<Notification> notificationsList() {
        List<Notification> notificationsList = notificationService.notificationsList();
        return notificationsList;
    }

    @DeleteMapping("delete/{id}")
    public Notification deleteNotification(@PathVariable("id") Long id) {
        return notificationService.deleteNotification(id);
    }





}
