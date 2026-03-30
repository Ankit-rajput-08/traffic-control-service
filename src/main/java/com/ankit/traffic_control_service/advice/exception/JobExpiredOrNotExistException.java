package com.ankit.traffic_control_service.advice.exception;

public class JobExpiredOrNotExistException extends RuntimeException{
    public JobExpiredOrNotExistException(String message) {
        super(message);
    }
}
