package com.genovia.medexpress.exception;

public class ConsultationResponseNotFoundException extends RuntimeException{
    private String message;

    public ConsultationResponseNotFoundException() {}

    public ConsultationResponseNotFoundException(String msg) {
        super(msg);

    }
}
