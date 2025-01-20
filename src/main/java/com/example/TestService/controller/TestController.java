package com.example.TestService.controller;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.NotificationResponse;
import com.example.TestService.service.Impl.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
    private final TestServiceImpl testService;

    @PostMapping
    public ResponseEntity<NotificationResponse> postNotification(
            @RequestBody NotificationRequest notificationRequest) {
        return new ResponseEntity<>(
                testService.notificationReturn(notificationRequest), HttpStatus.OK
        );
    }
}
