package com.example.GameChanga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(String phoneNumber, String name) {
        User user = new User();
        user.setPhoneNumber(phoneNumber);
        user.setName(name);
        return userRepository.save(user);
    }

    public Optional<User> findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
}
