package com.test.demo.service;

import com.test.demo.model.dto.UserDto;
import com.test.demo.model.dto.response.UserResponse;
import com.test.demo.model.entity.User;
import com.test.demo.model.mappers.UserMapper;
import com.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper mapper){
        this.userRepository = userRepository;
        this.mapper = mapper;
    }
    public UserResponse registerUser(UserDto userDto){
        User savedUser = userRepository.save(mapper.toEntity(userDto));
        return new UserResponse(savedUser.getId());
    }
}
