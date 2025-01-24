package com.example.TestService.service;

import com.example.TestService.dto.request.NotificationRequest;

public interface NotificationService {

    Boolean notificationReturn(NotificationRequest notificationRequest);

    Boolean getUserDTO(String id);
}
