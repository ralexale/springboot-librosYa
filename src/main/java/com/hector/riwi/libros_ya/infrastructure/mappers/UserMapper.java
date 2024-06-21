package com.hector.riwi.libros_ya.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.hector.riwi.libros_ya.api.dto.request.create.UserRequest;
import com.hector.riwi.libros_ya.api.dto.response.UserResponse;
import com.hector.riwi.libros_ya.domain.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "reservations", ignore = true)
    })
    User toUser(UserRequest userRequest);

    UserResponse toUserResponse(User user);

    void updateFromUserRequest(UserRequest userRequest, @MappingTarget User user);
}
