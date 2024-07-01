package com.example.piano_chill_be.model.notification;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CreateNotificationRequestDTO {


    private String name;

    private String content;

    private String receceiver;
}
