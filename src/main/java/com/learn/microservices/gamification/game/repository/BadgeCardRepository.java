package com.learn.microservices.gamification.game.repository;

import com.learn.microservices.gamification.game.domain.BadgeCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface BadgeCardRepository extends CrudRepository<BadgeCard, Long> {


    @Query("select new BadgeCard(s.userId, s.badgeTimeStamp, s.badge) from BadgeCard s where s.userId = :userId order by s.badgeTimeStamp desc ")
    List<BadgeCard> findByUserIdOrderByBadgeTimestampDesc(@Param("userId") Long userId);




}
