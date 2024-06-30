package com.example.GameChanga;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AirtimeService {

    @Value("${africastalking.apikey}")
    private String apiKey;

    @Value("${africastalking.username}")
    private String username;

    public void sendAirtime(String phoneNumber, double amount) {
        // Use Africa's Talking API to send airtime
        // Example: use Africa's Talking SDK or HTTP client to make the request
    }
}

