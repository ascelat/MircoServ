package com.example.TestService.mapper;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.TestResponse;
import com.example.TestService.model.Notification;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    Notification notification(NotificationRequest notificationRequest);
    List<TestResponse> toNotificationResponse(List<Notification> notification);
}
