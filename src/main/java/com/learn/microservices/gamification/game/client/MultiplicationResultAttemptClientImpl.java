package com.learn.microservices.gamification.game.client;

import com.learn.microservices.gamification.game.dto.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MultiplicationResultAttemptClientImpl implements MultiplicationResultAttemptClient{

    private final RestTemplate restTemplate;
    private final String multiplicationHost;


    @Autowired
    MultiplicationResultAttemptClientImpl(final RestTemplate restTemplate,@Value("${multiplicationHost}") final String multiplicationHost){
        this.restTemplate = restTemplate;
        this.multiplicationHost = multiplicationHost;
    }



    @Override
    public MultiplicationResultAttempt retrieveMultiplicationResultAttemptById(final Long multiplicationAttemptId) {
        return restTemplate.getForObject(
                multiplicationHost+ "/results/" + multiplicationAttemptId, MultiplicationResultAttempt.class
        );
    }
}
