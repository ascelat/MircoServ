package com.example.TestService.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListener {

    @KafkaListener(
            topics = "topic1",
            groupId = "group1"
    )
    public void listener(String text) {
        System.out.println(text);
    }
}
