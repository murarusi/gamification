package com.learn.microservices.gamification.game.dto;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.learn.microservices.gamification.game.client.MultiplicationResultAttemptDeserializer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@EqualsAndHashCode
@RequiredArgsConstructor
@Getter
@ToString
@JsonDeserialize(using = MultiplicationResultAttemptDeserializer.class)
public class MultiplicationResultAttempt  {


private final String userAlias;
private final int multiplicationFactorA;
private final int multiplicationFactorB;
private final int resultAttempt;
private final boolean correct;

MultiplicationResultAttempt(){
    userAlias = null;
    multiplicationFactorA = -1;
    multiplicationFactorB = -1;
    resultAttempt = -1;
    correct = false;
}

}

