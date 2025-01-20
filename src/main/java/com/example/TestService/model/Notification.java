package com.example.TestService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    @Column(name = "notificationId")
    private Long notificationId;

    @Column(name = "message")
    private String message;

    @Column(name = "sendTime")
    private LocalDateTime sendTime;

    @Column(name = "userIds")
    private List<String> userIds;

    @Column(name = "channels")
    private List<String> channels;
}
