package com.example.UserBranch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BranchRequest {
    private String branchId;

    private String name;

    private String timeZone;
}
