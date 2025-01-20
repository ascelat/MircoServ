package com.example.TestService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BaseSuccessResponse {
    private Integer statusCode;

    private Boolean success;

    public BaseSuccessResponse(Boolean success) {
        this(0, success);
    }
}
