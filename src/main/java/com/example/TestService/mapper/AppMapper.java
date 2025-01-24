package com.example.TestService.mapper;

import com.example.TestService.dto.UserResponse;
import com.example.TestService.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AppMapper {
    User mapUserToUserDTO(UserResponse userResponse);
}
