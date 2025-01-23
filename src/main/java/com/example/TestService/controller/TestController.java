package com.example.TestService.controller;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.service.Impl.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
    private final TestServiceImpl testService;

    private final String URL = "http://localhost:8081/api";

    @PostMapping
    public ResponseEntity<Boolean> postNotification(
            @RequestBody NotificationRequest notificationRequest) {
        return new ResponseEntity<>(
                testService.notificationReturn(notificationRequest), HttpStatus.OK
        );
    }

    @GetMapping("/user")
    public ResponseEntity<Boolean> getUserDTO() {
        WebClient webClient = WebClient.builder()
                .baseUrl(URL)
                .build();
        return new ResponseEntity<>(
                testService.getUserDTO(webClient), HttpStatus.OK
        );
    }

    @GetMapping("/branch")
    public ResponseEntity<Boolean> getBranchDTO() {
        WebClient webClient = WebClient.builder()
                .baseUrl(URL)
                .build();
        return new ResponseEntity<>(
                testService.getBranchDTO(webClient), HttpStatus.OK
        );
    }
}
