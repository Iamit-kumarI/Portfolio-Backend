package com.portfolio.profile_backend.service.Impl;


import com.portfolio.profile_backend.client.AtCoderAPIClient;
import com.portfolio.profile_backend.dto.APIResponse.AtCoderSubmissionDto;
import com.portfolio.profile_backend.service.AtCoderService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AtCoderServiceImpl implements AtCoderService {

    private final AtCoderAPIClient atCoderAPIClient;

    public AtCoderServiceImpl(AtCoderAPIClient atCoderAPIClient){
        this.atCoderAPIClient=atCoderAPIClient;
    }

    @Override
    public List<AtCoderSubmissionDto> getSubmissions() {
        AtCoderSubmissionDto[]response=atCoderAPIClient.fetchSubmissions();
//        return Arrays.asList(response);
        return Arrays.stream(response).limit(200).toList();
    }
}
