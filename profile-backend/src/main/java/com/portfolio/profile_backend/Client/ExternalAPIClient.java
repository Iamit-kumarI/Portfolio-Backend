package com.portfolio.profile_backend.Client;

import com.portfolio.profile_backend.dto.APIResponse.LtcResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalAPIClient {
    @Value("${spring.weather.api}")
    private String api;

    private RestTemplate restTemplate;

    public ExternalAPIClient(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    public LtcResponse.Root getLtcResponse(){
        return restTemplate.getForObject(api,LtcResponse.Root.class);
    }
}
