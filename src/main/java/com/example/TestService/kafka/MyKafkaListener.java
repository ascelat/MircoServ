package com.example.TestService.kafka;

import com.example.TestService.model.Notification;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {

    @KafkaListener(
            topics = "topic1",
            groupId = "group1"
    )
    public void listener(Notification notification) {
        System.out.println(notification);
    }
}
