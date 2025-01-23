package com.example.TestService.service;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.TestResponse;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.List;

public interface TestService {

    Boolean notificationReturn(NotificationRequest notificationRequest);

    Boolean getUserDTO(WebClient webClient);

    Boolean getBranchDTO(WebClient webClient);
}
