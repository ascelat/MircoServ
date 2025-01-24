package com.example.UserBranch.service.Impl;

import com.example.UserBranch.dto.UserRequest;
import com.example.UserBranch.mapper.UserMapper;
import com.example.UserBranch.model.Branch;
import com.example.UserBranch.model.User;
import com.example.UserBranch.repository.BranchRepository;
import com.example.UserBranch.repository.UserRepository;
import com.example.UserBranch.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final BranchRepository branchRepository;

    private final UserMapper userMapper;

    @Override
    public Boolean createUser(UserRequest userRequest, String branchId) {
        Branch branch = branchRepository.findById(branchId)
                .orElseThrow(() -> new RuntimeException("Not branch"));

        User user = userMapper.userMapp(userRequest);
        user.getBranch().add(branch);

        userRepository.save(user);
        return true;
    }

    @Override
    public User getUserId(String id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not found user"));
    }
}
