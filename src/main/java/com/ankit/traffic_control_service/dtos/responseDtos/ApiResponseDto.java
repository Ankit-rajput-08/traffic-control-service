package com.ankit.traffic_control_service.dtos.responseDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
public class ApiResponseDto <T> {

    private T apiResponseData;
    private Instant timestamp;

    public ApiResponseDto(T apiResponseData, Instant timestamp) {
        this.apiResponseData = apiResponseData;
        this.timestamp = Instant.now();
    }
}
