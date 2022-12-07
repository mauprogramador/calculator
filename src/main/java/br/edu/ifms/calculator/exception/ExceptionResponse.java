package br.edu.ifms.calculator.exception;

import java.util.Date;

public class ExceptionResponse {

    private Date timestamp;
    private String message;
    private String uri;

    public ExceptionResponse(Date timestamp, String message, String uri) {
        this.timestamp = timestamp;
        this.message = message;
        this.uri = uri;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return uri;
    }
}
