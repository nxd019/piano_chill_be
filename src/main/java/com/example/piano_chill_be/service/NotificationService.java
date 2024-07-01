package com.example.piano_chill_be.service;

import com.example.piano_chill_be.database.NotificationRepository;
import com.example.piano_chill_be.entity.Course;
import com.example.piano_chill_be.entity.Notification;
import com.example.piano_chill_be.model.notification.CreateNotificationRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements INotificationService{

    @Autowired
    NotificationRepository notificationRepository;


    @Override
    public Notification createNotification(CreateNotificationRequestDTO createNotificationRequestDTO) {
        Notification notification = new Notification();
        notification.setName(createNotificationRequestDTO.getName());
        notification.setContent(createNotificationRequestDTO.getContent());
        notification.setRececeiver(createNotificationRequestDTO.getRececeiver());
        notification = notificationRepository.save(notification);
        return notification;
    }

    @Override
    public List<Notification> notificationsList() {
        List<Notification> notificationsList = notificationRepository.findAll();
        return notificationsList;
    }

    @Override
    public Notification deleteNotification( Long id) {
        Notification notification = notificationRepository.findById(id).orElseThrow(() -> new ArithmeticException("COURSE NOT EXIST"));
        notificationRepository.deleteById(id);
        return notification;
    }
}
