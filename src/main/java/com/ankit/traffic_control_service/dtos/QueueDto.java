package com.ankit.traffic_control_service.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Builder

public class QueueDto {

    private String jobId;
    private String result;

    public QueueDto(String jobId, String result) {
        this.jobId = jobId;
        this.result = result;
    }
}
