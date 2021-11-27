package com.test.demo.exceptions;

import org.springframework.web.client.HttpClientErrorException;

public class AssessmentFailedException extends Exception{

    public AssessmentFailedException(String assessment_failed) {

    }
}
