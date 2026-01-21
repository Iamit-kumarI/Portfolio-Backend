package com.portfolio.profile_backend.controller;

import com.portfolio.profile_backend.dto.APIResponse.AtCoderSubmissionDto;
import com.portfolio.profile_backend.service.AtCoderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Atcoder")
public class AtCoderController {
    private final AtCoderService atCoderService;

    public AtCoderController(AtCoderService atCoderService){
        this.atCoderService=atCoderService;
    }
    @GetMapping("/Submissions")
    public List<AtCoderSubmissionDto>getSubmissions(){
        return atCoderService.getSubmissions();
    }

}
