package com.portfolio.profile_backend.service;
import com.portfolio.profile_backend.dto.APIResponse.AtCoderSubmissionDto;

import java.util.List;

public interface AtCoderService {
        List<AtCoderSubmissionDto> getSubmissions();
}
