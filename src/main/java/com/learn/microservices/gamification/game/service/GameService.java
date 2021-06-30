package com.learn.microservices.gamification.game.service;

import com.learn.microservices.gamification.game.domain.GameStats;

public interface GameService {

    GameStats newAttemptForUser(Long userId, Long attemptId, boolean correct);

    GameStats retrieveStatsForUser(Long userId);
}
