package com.test.demo.controllers;

import com.test.demo.model.dto.UserDto;
import com.test.demo.model.dto.response.UserResponse;
import com.test.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> registerUser(@RequestBody UserDto user){
        UserResponse userResponse = userService.registerUser(user.setAdmin(false));
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }

    @PostMapping("/registerAdmin")
    public ResponseEntity<UserResponse> registerAdminUser(@RequestBody UserDto user){
        UserResponse userResponse = userService.registerUser(user.setAdmin(true));
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
}
