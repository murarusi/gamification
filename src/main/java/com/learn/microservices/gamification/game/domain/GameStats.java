package com.learn.microservices.gamification.game.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class GameStats {

    private final Long userId;
    private final Integer score;
    private final List<Badge> badges;

    public GameStats(){
        this(0l, 0, new ArrayList<>());
    }

    public static GameStats emptyStats(Long userId){
        return new GameStats(userId, 0, Collections.emptyList());
    }

    public List<Badge> getBadges(){
        return Collections.unmodifiableList(badges);
    }
}
