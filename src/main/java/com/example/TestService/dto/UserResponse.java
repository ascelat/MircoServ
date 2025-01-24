package com.example.TestService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {
    private String userId;

    private String phoneNumber;

    private String email;

    private String fullName;

    private Set<BranchResponse> branch;
}
