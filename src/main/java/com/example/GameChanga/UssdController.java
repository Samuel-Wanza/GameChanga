package com.example.GameChanga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ussd")
public class UssdController {

    @Autowired
    private UserService userService;

    @Autowired
    private BettingService bettingService;

    @Autowired
    private LoyaltyService loyaltyService;

    @PostMapping
    public String handleUssdRequest(@RequestParam String sessionId,
                                    @RequestParam String serviceCode,
                                    @RequestParam String phoneNumber,
                                    @RequestParam String text) {

        String response = "";
        if (text.isEmpty()) {
            // Main menu
            response = "CON Welcome to GameChanga\n";
            response += "1. Place a bet\n";
            response += "2. Check bet status\n";
            response += "3. Manage account\n";
            response += "4. Loyalty program\n";
        } else {
            // Handle sub-menus and user input
            if (text.equals("4")) {
                response = "CON Loyalty Program\n";
                response += "1. Check points\n";
                response += "2. Redeem rewards\n";
            } else {
                // Additional logic for other options
            }
        }

        return response;
    }
}
