package com.portfolio.profile_backend.controller;

import com.portfolio.profile_backend.dto.APIResponse.LtcResponse;
import com.portfolio.profile_backend.service.LtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class LtcController {

    private final LtcService ltcService;

    public LtcController(LtcService ltcService){
        this.ltcService=ltcService;
    }

    @GetMapping("/LeetCode")
    public ResponseEntity<LtcResponse.Root>getAllDetails(){
        LtcResponse.Root response=ltcService.getProfile();
        return ResponseEntity.ok(response);//9
    }
}
