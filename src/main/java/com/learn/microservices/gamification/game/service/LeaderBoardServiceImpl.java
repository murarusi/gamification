package com.learn.microservices.gamification.game.service;


import com.learn.microservices.gamification.game.domain.LeaderBoardRow;
import com.learn.microservices.gamification.game.repository.ScoreCardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class LeaderBoardServiceImpl implements LeaderBoardService {

    private ScoreCardRepository scoreCardRepository;

    LeaderBoardServiceImpl(ScoreCardRepository scoreCardRepository) {
        this.scoreCardRepository = scoreCardRepository;
    }

    @Override
    public List<LeaderBoardRow> getCurrentLeaderBoard() {
        return scoreCardRepository.findFirst10();
    }
}
