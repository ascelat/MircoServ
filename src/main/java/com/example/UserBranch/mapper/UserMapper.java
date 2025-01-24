package com.example.UserBranch.mapper;

import com.example.UserBranch.dto.UserRequest;
import com.example.UserBranch.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userMapp(UserRequest userRequest);
}
