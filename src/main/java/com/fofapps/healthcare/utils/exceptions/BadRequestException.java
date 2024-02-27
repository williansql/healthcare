package com.fofapps.healthcare.utils.exceptions;

public class BadRequestException extends Exception {

    public BadRequestException(String message){
        super(message);
    }

    public BadRequestException(String message, Throwable cause){
        super(message, cause);
    }
}
