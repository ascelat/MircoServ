package com.example.TestService.mapper;

import com.example.TestService.dto.BranchDTO;
import com.example.TestService.dto.UserDTO;
import com.example.TestService.model.Branch;
import com.example.TestService.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AppMapper {

    User mapUserToUserDTO(UserDTO userDTO);

    @Mapping(target = "owner", ignore = true)
    Branch mapBranchToBranchDTO(BranchDTO branchDTO);
}
