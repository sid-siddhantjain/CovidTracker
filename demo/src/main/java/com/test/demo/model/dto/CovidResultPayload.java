package com.test.demo.model.dto;

import com.test.demo.model.CovidResultEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class CovidResultPayload {
    private Integer userId;
    private Integer adminId;
    private CovidResultEnum result;
}
