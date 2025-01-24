package com.example.UserBranch.controller;

import com.example.UserBranch.dto.BranchRequest;
import com.example.UserBranch.model.Branch;
import com.example.UserBranch.service.BranchService;
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
@RequestMapping("/api/branch")
@RequiredArgsConstructor
public class BranchController {
    private final BranchService branchService;

    @PostMapping
    public ResponseEntity<Boolean> create(@RequestBody BranchRequest branchRequest,
                                          @PathParam("id") String id){
        return new ResponseEntity<>(
                branchService.createBranch(branchRequest,id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Branch> getBranch(@PathParam("id") String id){
        return new ResponseEntity<>(
                branchService.getBranch(id), HttpStatus.OK);
    }
}
