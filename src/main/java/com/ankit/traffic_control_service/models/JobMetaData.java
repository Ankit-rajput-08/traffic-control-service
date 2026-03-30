package com.ankit.traffic_control_service.models;

import com.ankit.traffic_control_service.enums.JobStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobMetaData {

    private String JobId;
    private JobStatus cureentjobStatus;
}
