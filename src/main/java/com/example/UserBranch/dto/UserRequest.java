package com.example.UserBranch.dto;

import com.example.UserBranch.model.Branch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class UserRequest {
    private String userId;

    private String phoneNumber;

    private String email;

    private String fullName;

    private List<Branch> branch;
}
