package com.test.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class UserDto {
    private Integer id;
    private String name;
    private String phone;
    private Integer pincode;
    private boolean isAdmin;
}
