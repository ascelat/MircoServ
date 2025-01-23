package com.example.TestService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String userId;

    private String phoneNumber;

    private String email;

    private String fullName;

    private List<BranchDTO> branch;
}
