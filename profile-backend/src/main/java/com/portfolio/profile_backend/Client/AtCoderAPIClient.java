package com.portfolio.profile_backend.client;

import com.portfolio.profile_backend.dto.APIResponse.AtCoderSubmissionDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.List;

//import java.net.http.HttpHeaders;

@Component
public class AtCoderAPIClient {

    @Value("${spring.atcoder.api}")
    private String api;

    private final RestTemplate restTemplate;

    public AtCoderAPIClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public AtCoderSubmissionDto[] fetchSubmissions() {

        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.USER_AGENT, "Mozilla/5.0");
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<AtCoderSubmissionDto[]> response =
                restTemplate.exchange(
                        api,
                        HttpMethod.GET,
                        entity,
                        AtCoderSubmissionDto[].class
                );

        return response.getBody();
    }
}
