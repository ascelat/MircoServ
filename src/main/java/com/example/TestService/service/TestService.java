package com.example.TestService.service;

import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.dto.response.TestResponse;
import java.util.List;

public interface TestService {

    Boolean notificationReturn(NotificationRequest notificationRequest);

    Boolean getUserDTO();

    Boolean getBranchDTO();
}
