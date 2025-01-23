package com.example.TestService.service.Impl;

import com.example.TestService.dto.BranchDTO;
import com.example.TestService.dto.UserDTO;
import com.example.TestService.dto.request.NotificationRequest;
import com.example.TestService.mapper.AppMapper;
import com.example.TestService.mapper.NotificationMapper;
import com.example.TestService.model.Branch;
import com.example.TestService.model.Notification;
import com.example.TestService.model.User;
import com.example.TestService.repository.BranchRepository;
import com.example.TestService.repository.NotificationRepository;
import com.example.TestService.repository.UserRepository;
import com.example.TestService.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final String URL_USER = "http://localhost:8081/api/user";
    private final String URL_BRANCH = "http://localhost:8081/api/branch";

    private final NotificationRepository notificationRepository;
    private final UserRepository userRepository;
    private final BranchRepository branchRepository;

    private final NotificationMapper notificationMapper;
    private final AppMapper appMapper;

    @Override
    public Boolean notificationReturn(NotificationRequest notificationRequest) {
        Notification notification = notificationMapper.notification(notificationRequest);
        notificationRepository.save(notification);
        return true;
    }

    @Override
    public Boolean getUserDTO(){
        WebClient webClient = WebClient.builder()
                .baseUrl(URL_USER)
                .build();

        User user = appMapper.mapUserToUserDTO(webClient.get()
                .retrieve()
                .bodyToMono(UserDTO.class).block());

        userRepository.save(user);

        return true;
    }

    @Override
    public Boolean getBranchDTO(){
        WebClient webClient = WebClient.builder()
                .baseUrl(URL_BRANCH)
                .build();

        Branch branch = appMapper.mapBranchToBranchDTO(webClient.get()
                .retrieve()
                .bodyToMono(BranchDTO.class).block());

        branchRepository.save(branch);

        return true;
    }
}
