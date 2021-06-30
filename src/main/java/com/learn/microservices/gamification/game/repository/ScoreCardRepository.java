package com.learn.microservices.gamification.game.repository;

import com.learn.microservices.gamification.game.domain.LeaderBoardRow;
import com.learn.microservices.gamification.game.domain.ScoreCard;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScoreCardRepository extends CrudRepository<ScoreCard, Long> {


    @Query("SELECT  SUM(s.score) from ScoreCard s where  s.userId = :userId group by s.userId")
     Integer getTotalScoreForUser(@Param("userId") Long userId);


    @Query("select  new ScoreCard(s.cardId, s.userId, s.attemptId, s.scoreTimestamp, s.score) from ScoreCard s where s.userId = :userId order by s.scoreTimestamp desc ")
     List<ScoreCard> findByUserIdOrderByScoreTimestampDesc(@Param("userId") Long userId);


    @Query("select new com.learn.microservices.gamification.game.domain.LeaderBoardRow(s.userId, SUM (s.score)) from ScoreCard s group by s.userId order by SUM (s.score) desc ")
     List<LeaderBoardRow> findFirst10();
}
