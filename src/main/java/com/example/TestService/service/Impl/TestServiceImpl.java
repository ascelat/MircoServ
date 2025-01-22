package com.example.TestService.service.Impl;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.NotificationResponse;
import com.example.TestService.mapper.NotificationMapper;
import com.example.TestService.model.Notification;
import com.example.TestService.repository.NotificationRepository;
import com.example.TestService.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    @Override
    public NotificationResponse notificationReturn(NotificationRequest notificationRequest) {
        Notification notification = notificationMapper.notification(notificationRequest);
        notificationRepository.save(notification);
        return notificationMapper.toNotificationResponse(notification);
    }
}
