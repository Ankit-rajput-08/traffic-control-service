package com.ankit.traffic_control_service.dtos.responseDtos;

import com.ankit.traffic_control_service.enums.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobRequestResponseDto {

    private String jobId;
    private JobStatus currentjobStatus;
}
