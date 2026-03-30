package com.ankit.traffic_control_service.advice.exception;

public class MainQueueIsFullException extends RuntimeException{
    public MainQueueIsFullException(String message) {
        super(message);
    }
}
