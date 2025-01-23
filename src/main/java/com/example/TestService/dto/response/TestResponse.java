package com.example.TestService.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TestResponse {
    private Long notificationId;

    private String message;

    private LocalDateTime sendTime;

    private List<String> userIds;

    private List<String> channels;
}
