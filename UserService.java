package com.example.Backend.Service;

import java.time.LocalDateTime;

public interface UserService {
    String registerUser(String registrationDTO);
    void enrollForOfflinePayment(String userId);
    boolean isUserAllowedToUseFunctionality(String userId);
    String getUserSecretByUserId(String userId);
    String getUserIdFromToken(String Token);
    String exchangeUserSecretForToken(String userSecret);
    void approveRegistration(String userId);
    void switchOfflinePayements(String userId, boolean enable, LocalDateTime currentDateTime, Double latitude, Double longitude);
    public boolean isCooldownPeriodElapsed(String userId, LocalDateTime currentDateTime);
}
