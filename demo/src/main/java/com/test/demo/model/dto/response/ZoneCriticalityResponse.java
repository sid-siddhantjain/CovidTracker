package com.test.demo.model.dto.response;

import com.test.demo.model.CriticalityEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZoneCriticalityResponse {
    private CriticalityEnum criticality;
}
