package com.example.TestService.service.Impl;

import com.example.TestService.model.Notification;
import com.example.TestService.repository.NotificationRepository;
import com.example.TestService.service.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaServiceImpl implements KafkaService {

    private final ObjectMapper mapper;

    private final NotificationRepository notificationRepository;

    @KafkaListener(
            topics = "topic1",
            groupId = "group1"
    )
    public void listener(String jsonNotification) {
        try {
            Notification notification = mapper
                    .readValue(jsonNotification, Notification.class);

            notificationRepository.save(notification);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
