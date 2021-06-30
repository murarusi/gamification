package com.learn.microservices.gamification.game.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Entity
public final class ScoreCard {

    public static final int DEFAULT_SCORE = 10;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ID")
    private final Long cardId;

    @Column(name = "USER_ID")
    private final Long userId;

    @Column(name = "ATTEMPT_ID")
    private final Long attemptId;

    @Column(name = "SCORE_TS")
    private final Long scoreTimestamp;

    @Column(name = "SCORE")
    private final int score;


    protected ScoreCard(){this(null, null, null, 0l, 0);}

    public ScoreCard(final Long userId, final Long attemptId){
        this.cardId = null;
        this.attemptId =attemptId;
        this.userId = userId;
        this.scoreTimestamp = System.currentTimeMillis();
        this.score = DEFAULT_SCORE;
    }

}
