package com.learn.microservices.gamification.game.service;

import com.learn.microservices.gamification.game.domain.LeaderBoardRow;

import java.util.List;

public interface LeaderBoardService {

    List<LeaderBoardRow> getCurrentLeaderBoard();
}
