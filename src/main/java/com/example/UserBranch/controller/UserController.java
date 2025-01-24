package com.example.UserBranch.controller;

import com.example.UserBranch.dto.UserRequest;
import com.example.UserBranch.model.User;
import com.example.UserBranch.service.UserService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<Boolean> created(@RequestBody UserRequest userRequest,
                                           @PathParam("id") String branchId) {
        return new ResponseEntity<>(
                userService.createUser(userRequest, branchId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> getUser(@PathParam("id") String id){
        return new ResponseEntity<>(
                userService.getUserId(id), HttpStatus.OK);
    }
}
