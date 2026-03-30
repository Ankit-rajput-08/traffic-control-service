package com.ankit.traffic_control_service.advice;


import com.ankit.traffic_control_service.advice.exception.JobExpiredOrNotExistException;
import com.ankit.traffic_control_service.advice.exception.MainQueueIsFullException;
import com.ankit.traffic_control_service.enums.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MainQueueIsFullException.class)
    public ResponseEntity<ApiError> handleMainQueueIsFullException(MainQueueIsFullException e){
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(ApiError.builder()
                        .message(e.getMessage())
                        .timestamp(Instant.now())
                        .errorCode(com.ankit.traffic_control_service.enums.Error.QUEUE_FULL.toString())
                        .build());
    }

    @ExceptionHandler(JobExpiredOrNotExistException.class)
    public ResponseEntity<ApiError> handleJobExpiredOrNotExistsException(JobExpiredOrNotExistException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ApiError.builder()
                        .message(e.getMessage())
                        .timestamp(Instant.now())
                        .errorCode(Error.JOB_EXPIRED_OR_NOT_EXISTS.toString())
                        .build()
                );
    }
}
