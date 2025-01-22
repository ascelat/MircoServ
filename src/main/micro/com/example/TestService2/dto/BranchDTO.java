package com.example.TestService2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BranchDTO {
    private String branchId;

    private String name;

    private String timeZone;
}
