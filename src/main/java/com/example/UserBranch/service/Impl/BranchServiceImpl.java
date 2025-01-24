package com.example.UserBranch.service.Impl;

import com.example.UserBranch.dto.BranchRequest;
import com.example.UserBranch.mapper.BranchMapper;
import com.example.UserBranch.model.Branch;
import com.example.UserBranch.model.User;
import com.example.UserBranch.repository.BranchRepository;
import com.example.UserBranch.repository.UserRepository;
import com.example.UserBranch.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BranchServiceImpl implements BranchService {
    private final BranchRepository branchRepository;

    private final UserRepository userRepository;

    private final BranchMapper branchMapper;

    @Override
    public Boolean createBranch(BranchRequest branchRequest, String userIds) {
        User user = userRepository.findById(userIds)
                .orElseThrow(()-> new RuntimeException("Not users"));

        Branch branch = branchMapper.branchMapp(branchRequest);
        branch.getOwner().add(user);

        branchRepository.save(branch);
        return true;
    }

    @Override
    public Branch getBranch(String id) {
        return branchRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Not found branch"));
    }
}
