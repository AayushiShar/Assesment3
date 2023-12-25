package com.example.Backend.Service;

import com.example.Backend.model.User;

import java.math.BigDecimal;
import java.util.List;

public interface WalletService {


    void addFunds(User user, BigDecimal amount);
    void addOfflinePaymentAmount(User user, BigDecimal amount);

    List<String> generateOfflinePaymentCodes(User user, int numberOfCodes);
    User getUserFromToken(String token);

    BigDecimal getWalletBalance(User user);

    // Helper method to generate unique codes (example implementation)
}