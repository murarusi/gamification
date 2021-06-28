package com.learn.microservices.gamification.game.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@Entity
public final class BadgeCard {

    @Id
    @GeneratedValue
    @Column(name = "BADGE_ID")
    private Long id;

    private final Long userId;
    private final Long badgeTimeStamp;
    private final Badge badge;


    protected BadgeCard(){this(null, 0l, null);}



    public BadgeCard(final Long userId, final Badge badge){
        this.badge = badge;
        this.userId = userId;
        this.badgeTimeStamp = System.currentTimeMillis();
    }







}
