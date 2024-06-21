package com.hector.riwi.libros_ya.infrastructure.abstract_services;

import com.hector.riwi.libros_ya.api.dto.request.create.UserRequest;
import com.hector.riwi.libros_ya.api.dto.response.UserResponse;

public interface IUserService extends CreateDeleteReadService<UserRequest, UserResponse, Long> {

}
