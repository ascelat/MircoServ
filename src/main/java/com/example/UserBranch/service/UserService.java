package com.example.UserBranch.service;

import com.example.UserBranch.dto.UserRequest;
import com.example.UserBranch.model.User;

public interface UserService {
    Boolean createUser(UserRequest user, String branchId);

    User getUserId(String id);
}
