package com.example.Backend.exception;

public class OfflinePaymentLimitExceeded extends RuntimeException {
    public OfflinePaymentLimitExceeded(String message){
        super(message);
    }
}