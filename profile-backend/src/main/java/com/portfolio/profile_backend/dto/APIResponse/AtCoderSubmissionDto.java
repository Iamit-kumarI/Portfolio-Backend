package com.portfolio.profile_backend.dto.APIResponse;

import lombok.Data;

@Data
public class AtCoderSubmissionDto {
        private Long id;
        private Long epoch_second;
        private String problem_id;
        private String contest_id;
        private String result;
        private String language;
        private Integer point;
}
