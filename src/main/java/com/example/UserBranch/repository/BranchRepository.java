package com.example.UserBranch.repository;

import com.example.UserBranch.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, String> {
}
