package br.edu.ifms.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidValueException extends RuntimeException {
    public InvalidValueException(String message) {
        super(message);
    }   
}