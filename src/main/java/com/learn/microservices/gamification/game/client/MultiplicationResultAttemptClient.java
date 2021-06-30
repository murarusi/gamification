package com.learn.microservices.gamification.game.client;

import com.learn.microservices.gamification.game.dto.MultiplicationResultAttempt;
import org.springframework.data.jpa.repository.Query;

public interface MultiplicationResultAttemptClient {


    MultiplicationResultAttempt retrieveMultiplicationResultAttemptById(final Long multiplicationId);
}
