package com.example.TestService.service;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.NotificationResponse;

public interface TestService {

    NotificationResponse notificationReturn(NotificationRequest notificationRequest);
}
