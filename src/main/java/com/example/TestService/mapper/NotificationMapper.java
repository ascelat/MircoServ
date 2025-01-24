package com.example.TestService.mapper;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.model.Notification;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper {
    Notification notification(NotificationRequest notificationRequest);
}
