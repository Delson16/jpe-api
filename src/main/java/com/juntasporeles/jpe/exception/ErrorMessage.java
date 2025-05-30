package com.juntasporeles.jpe.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public class ErrorMessage {
    
    private String message;
    private HttpStatus status;
    
}
