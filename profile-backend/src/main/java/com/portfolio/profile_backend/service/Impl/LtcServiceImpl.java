package com.portfolio.profile_backend.service.Impl;

import com.portfolio.profile_backend.client.ExternalAPIClient;
import com.portfolio.profile_backend.dto.APIResponse.LtcResponse;
import com.portfolio.profile_backend.service.LtcService;
import org.springframework.stereotype.Service;

@Service
public class LtcServiceImpl implements LtcService {

    private final ExternalAPIClient apiClient;

    public LtcServiceImpl (ExternalAPIClient apiClient){
        this.apiClient=apiClient;
    }
    @Override
    public LtcResponse.Root getProfile(){
        return apiClient.getLtcResponse();
    }
}
