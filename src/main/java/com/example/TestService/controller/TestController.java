package com.example.TestService.controller;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.service.Impl.NotificationServiceImpl;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
    private final NotificationServiceImpl testService;

    @PostMapping
    public ResponseEntity<Boolean> postNotification(
            @RequestBody NotificationRequest notificationRequest) {
        return new ResponseEntity<>(
                testService.notificationReturn(notificationRequest), HttpStatus.OK
        );
    }

    @GetMapping("/user")
    public ResponseEntity<Boolean> getUser(@PathParam("id") String id) {
        return new ResponseEntity<>(testService.getUserDTO(id), HttpStatus.OK);
    }
}
