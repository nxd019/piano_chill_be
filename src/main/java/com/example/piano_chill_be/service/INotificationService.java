package com.example.piano_chill_be.service;

import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.entity.Notification;
import com.example.piano_chill_be.model.notification.CreateNotificationRequestDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface INotificationService {

    Notification createNotification(CreateNotificationRequestDTO createNotificationRequestDTO);

    List<Notification> notificationsList();

    Notification deleteNotification(Long id);

}

