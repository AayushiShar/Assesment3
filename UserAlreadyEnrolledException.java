package com.example.Backend.exception;

public class UserAlreadyEnrolledException extends RuntimeException {
    public UserAlreadyEnrolledException(String message){
        super(message);
    }

}