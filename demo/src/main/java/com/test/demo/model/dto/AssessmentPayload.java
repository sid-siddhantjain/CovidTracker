package com.test.demo.model.dto;

import com.test.demo.model.Symptoms;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@AllArgsConstructor
public class AssessmentPayload {

    private Integer userId;
    private List<Symptoms> symptoms;
    private boolean travelHistory;
    private boolean contactWithCovidPatient;
}
