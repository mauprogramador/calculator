package br.edu.ifms.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ArithmeticException extends RuntimeException {

    public ArithmeticException(String message) {
        super(message);
    }   
}