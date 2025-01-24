package com.example.TestService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BranchResponse {
    private String branchId;

    private String name;

    private String timeZone;
}
