package com.example.TestService2.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String userId;

    private String phoneNumber;

    private String email;

    private String fullName;

    private BranchDTO branch;
}
