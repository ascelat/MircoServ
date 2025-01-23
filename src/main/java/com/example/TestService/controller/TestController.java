package com.example.TestService.controller;

import com.example.TestService.dto.BranchDTO;
import com.example.TestService.dto.UserDTO;
import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.TestResponse;
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
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class TestController {
    private final TestServiceImpl testService;

    @PostMapping
    public ResponseEntity<Boolean> postNotification(
            @RequestBody NotificationRequest notificationRequest) {
        return new ResponseEntity<>(
                testService.notificationReturn(notificationRequest), HttpStatus.OK
        );
    }

    @GetMapping("/userDto")
    public ResponseEntity<Boolean> getUserDTO() {
        return new ResponseEntity<>(
                testService.getUserDTO(), HttpStatus.OK
        );
    }

    @GetMapping("/branchDto")
    public ResponseEntity<Boolean> getBranchDTO() {
        return new ResponseEntity<>(
                testService.getBranchDTO(), HttpStatus.OK
        );
    }
}
