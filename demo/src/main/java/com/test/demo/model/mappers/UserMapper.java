package com.test.demo.model.mappers;

import com.test.demo.model.dto.UserDto;
import com.test.demo.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User toEntity(UserDto userDto){
        return new User(userDto.getId(), userDto.getName(), userDto.getPhone(), userDto.getPincode(), userDto.isAdmin());
    }

    public UserDto toDto(User user) {
        return new UserDto(user.getId(), user.getName(), user.getPhone(), user.getPincode(), user.getIsAdmin());
    }
}
