package com.portfolio.profile_backend.dto.APIResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtCoderProfileDto {

    private String username;
    private int totalSubmissions;
    private int acceptedSubmissions;
    private int totalContestsParticipated;
    private double submissionRatio;
    private Map<String, Integer> languageUsed;
}