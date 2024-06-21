package com.hector.riwi.libros_ya.infrastructure.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hector.riwi.libros_ya.api.dto.request.create.UserRequest;
import com.hector.riwi.libros_ya.api.dto.response.UserResponse;
import com.hector.riwi.libros_ya.domain.entities.User;
import com.hector.riwi.libros_ya.domain.repository.UserRepository;
import com.hector.riwi.libros_ya.infrastructure.abstract_services.IUserService;
import com.hector.riwi.libros_ya.infrastructure.mappers.UserMapper;
import com.hector.riwi.libros_ya.util.exceptions.IdNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public UserResponse create(UserRequest userRequest) {
        User user = userMapper.toUser(userRequest);
        User savedUser = userRepository.save(user);

        return userMapper.toUserResponse(savedUser);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Page<UserResponse> getAll(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable);
        return users.map(userMapper::toUserResponse);
    }

    @Override
    public Optional<UserResponse> getById(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isEmpty()) throw new IdNotFoundException("USER", id);

        return user.map(userMapper::toUserResponse);
    }

    @Override
    public UserResponse update(UserRequest userRequest, Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IdNotFoundException("USER", id));
        userMapper.updateFromUserRequest(userRequest, user);

        User userSaved = userRepository.save(user);
        return userMapper.toUserResponse(userSaved);
    }
}
