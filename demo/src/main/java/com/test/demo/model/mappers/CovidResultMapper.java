package com.test.demo.model.mappers;

import com.test.demo.model.CovidResultEnum;
import com.test.demo.model.dto.CovidResultPayload;
import com.test.demo.model.entity.CovidResult;

public class CovidResultMapper {
    public CovidResult toEntity(CovidResultPayload covidResultPayload){
        CovidResult covidResult = new CovidResult();
        covidResult.setAdminId(covidResult.getAdminId());
        covidResult.setUserId(covidResult.getUserId());
        covidResult.setCovidResult(!covidResultPayload.getResult().equals(CovidResultEnum.Negative));
       return covidResult;
    }
}
