package com.test.demo.service;

import com.test.demo.exceptions.AssessmentFailedException;
import com.test.demo.model.CovidResultEnum;
import com.test.demo.model.dto.AssessmentPayload;
import com.test.demo.model.dto.CovidResultPayload;
import com.test.demo.model.entity.CovidResult;
import com.test.demo.model.entity.User;
import com.test.demo.repository.CovidResultRepository;
import com.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssessmentService {

    private final CovidResultRepository covidResultRepository;
    private final UserRepository userRepository;

    @Autowired
    public AssessmentService(CovidResultRepository covidResultRepository, UserRepository userRepository){
        this.covidResultRepository = covidResultRepository;
        this.userRepository = userRepository;
    }

    public Integer assessUser(AssessmentPayload assessmentPayload) throws AssessmentFailedException {
        int totalSymptoms = assessmentPayload.getSymptoms().size();

        if(totalSymptoms == 0 && !assessmentPayload.isContactWithCovidPatient() && !assessmentPayload.isTravelHistory()) {
            return 5;
        }else if(assessmentPayload.isTravelHistory() || assessmentPayload.isContactWithCovidPatient()) {
            if (totalSymptoms == 1)
                return 50;
            else if (totalSymptoms == 2) {
                return 75;
            }else {
                return 95;
            }
        }else{
            throw new AssessmentFailedException("Assessment Failed");
        }
    }

    public Boolean updateCovidResult(CovidResultPayload covidResultPayload){
        Optional<CovidResult> savedCovidResultOptional = covidResultRepository.findById(covidResultPayload.getUserId());
        boolean currStatus = covidResultPayload.getResult().equals(CovidResultEnum.Negative) ? false: true;
        if(savedCovidResultOptional.isPresent()){
            CovidResult savedCovidResult = savedCovidResultOptional.get();
            savedCovidResult.setCovidResult(currStatus);
            return covidResultRepository.saveAndFlush(savedCovidResult).isCovidResult();
        }
        return null;
    }
}
