package com.example.UserBranch.mapper;

import com.example.UserBranch.dto.BranchRequest;
import com.example.UserBranch.model.Branch;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BranchMapper {
    @Mapping(target = "owner", ignore = true)
    Branch branchMapp(BranchRequest branchRequest);
}
