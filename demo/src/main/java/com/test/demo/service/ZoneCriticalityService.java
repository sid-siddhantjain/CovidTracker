package com.test.demo.service;

import com.test.demo.model.dto.ZoneCriticalityPayload;
import com.test.demo.model.dto.response.ZoneCriticalityResponse;
import com.test.demo.model.entity.CovidResult;
import com.test.demo.model.entity.User;
import com.test.demo.repository.CovidResultRepository;
import com.test.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ZoneCriticalityService {

    private final UserRepository userRepository;
    private final CovidResultRepository covidResultRepository;

    @Autowired
    public ZoneCriticalityService(UserRepository userRepository, CovidResultRepository covidResultRepository){
        this.userRepository = userRepository;
        this.covidResultRepository = covidResultRepository;
    }
    public ZoneCriticalityResponse getCriticality(ZoneCriticalityPayload zoneCriticalityPayload){
        List<User> userWithPincode = userRepository.findByPincode(zoneCriticalityPayload.getPincode());
        List<CovidResult> covidResults = covidResultRepository.findByUserIdIn(userWithPincode)
                .stream()
                .map(user->user.getUserId())
                .collect(Collectors.toList()));
    }
}
