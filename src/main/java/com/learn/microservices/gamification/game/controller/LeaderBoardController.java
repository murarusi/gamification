package com.learn.microservices.gamification.game.controller;

import com.learn.microservices.gamification.game.domain.LeaderBoardRow;
import com.learn.microservices.gamification.game.service.LeaderBoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leaders")
public class LeaderBoardController {

    private final LeaderBoardService leaderBoardService;


    public LeaderBoardController(LeaderBoardService leaderBoardService) {
        this.leaderBoardService = leaderBoardService;
    }


    @GetMapping
    public List<LeaderBoardRow> getLeaderBoard(){
        return leaderBoardService.getCurrentLeaderBoard();
    }


}
