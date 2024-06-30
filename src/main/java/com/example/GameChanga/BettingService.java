package com.example.GameChanga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BettingService {
    @Autowired
    private BetRepository betRepository;

    public Bet placeBet(Long userId, double amount) {
        Bet bet = new Bet();
        bet.setUserId(userId);
        bet.setAmount(amount);
        return betRepository.save(bet);
    }

    public List<Bet> getBetsByUserId(Long userId) {
        return betRepository.findByUserId(userId);
    }
}
