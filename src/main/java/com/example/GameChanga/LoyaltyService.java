package com.example.GameChanga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoyaltyService {
    @Autowired
    private UserRepository userRepository;

    public void addLoyaltyPoints(String phoneNumber, int points) {
        Optional<User> userOpt = userRepository.findByPhoneNumber(phoneNumber);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            user.setLoyaltyPoints(user.getLoyaltyPoints() + points);
            userRepository.save(user);
        }
    }

    public int checkLoyaltyPoints(String phoneNumber) {
        Optional<User> userOpt = userRepository.findByPhoneNumber(phoneNumber);
        return userOpt.map(User::getLoyaltyPoints).orElse(0);
    }
}
