package com.joseph.rest.webservices.restful_web_services.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDateTime;

//Custom exception Structure
public class ErrorDetails {
    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
