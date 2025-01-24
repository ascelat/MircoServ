package com.example.TestService.service.Impl;

import com.example.TestService.dto.UserResponse;
import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.mapper.AppMapper;
import com.example.TestService.mapper.NotificationMapper;
import com.example.TestService.model.Notification;
import com.example.TestService.model.User;
import com.example.TestService.repository.BranchRepository;
import com.example.TestService.repository.NotificationRepository;
import com.example.TestService.repository.UserRepository;
import com.example.TestService.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository notificationRepository;

    private final UserRepository userRepository;

    private final BranchRepository branchRepository;

    private final NotificationMapper notificationMapper;

    private final AppMapper appMapper;

    private final WebClient webClient;

    @Override
    public Boolean notificationReturn(NotificationRequest notificationRequest) {
        Notification notification = notificationMapper.notification(notificationRequest);
        notificationRepository.save(notification);
        return true;
    }

    @Override
    public Boolean getUserDTO(String id) {
        User user = appMapper.mapUserToUserDTO(webClient
                .get()
                .uri(uriBuilder ->
                        uriBuilder.path("/user")
                                .queryParam("id", id)
                                .build())
                .retrieve()
                .bodyToMono(UserResponse.class)
                .block());

        userRepository.save(user);

        return true;
    }
}
