package com.example.UserBranch.service;

import com.example.UserBranch.dto.BranchRequest;
import com.example.UserBranch.model.Branch;
import com.example.UserBranch.model.User;

public interface BranchService {
    Boolean createBranch(BranchRequest branch, String userId);

    Branch getBranch(String id);
}
