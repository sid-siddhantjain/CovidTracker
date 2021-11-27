package com.test.demo.controllers;

import com.test.demo.exceptions.AssessmentFailedException;
import com.test.demo.model.dto.AssessmentPayload;
import com.test.demo.model.dto.CovidResultPayload;
import com.test.demo.model.dto.response.AssessmentResponse;
import com.test.demo.model.dto.response.CovidResultUpdateResponse;
import com.test.demo.service.AssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Objects;

@RestController("/assessment")
public class Assessment {

    private AssessmentService assessmentService;

    @Autowired
    public Assessment(AssessmentService assessmentService){
        this.assessmentService = assessmentService;
    }

    @PostMapping
    public ResponseEntity<AssessmentResponse> assessUser(@RequestBody AssessmentPayload assessmentPayload) throws Exception{
        try{
            Integer assessmentPercentage = assessmentService.assessUser(assessmentPayload);
            return new ResponseEntity<>(new AssessmentResponse(assessmentPercentage), HttpStatus.OK);
        }
        catch(AssessmentFailedException afe){
            throw new Exception("Assessment Could not be completed");
        }
    }

    @PutMapping
    public ResponseEntity<CovidResultUpdateResponse> updateCovidResult(CovidResultPayload covidResultPayload) throws Exception{
        Boolean updated = assessmentService.updateCovidResult(covidResultPayload);
        if(Objects.isNull(updated)){
            throw new Exception("Update could not be completed");
        }
        else{
            return new ResponseEntity<>(new CovidResultUpdateResponse(true), HttpStatus.OK);
        }
    }
}
