package com.example.UserBranch.repository;

import com.example.UserBranch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
