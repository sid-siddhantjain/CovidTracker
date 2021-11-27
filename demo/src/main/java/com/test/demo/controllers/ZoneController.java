package com.test.demo.controllers;

import com.test.demo.model.dto.ZoneCriticalityPayload;
import com.test.demo.model.dto.response.ZoneCriticalityResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZoneController {

    @PostMapping("/zone")
    public ResponseEntity<ZoneCriticalityResponse> getZoneCriticality(@RequestBody ZoneCriticalityPayload zoneCriticalityPayload){

    }
}
