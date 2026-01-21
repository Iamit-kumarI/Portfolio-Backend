package com.portfolio.profile_backend.service;

import com.portfolio.profile_backend.dto.APIResponse.CodeChefResponse;
import com.portfolio.profile_backend.dto.APIResponse.LtcResponse;

public interface LtcService {
    LtcResponse.Root getProfile();
    CodeChefResponse chfProfile();
}
