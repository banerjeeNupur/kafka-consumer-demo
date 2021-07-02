package com.kafka.consumerexample.listener;

import com.kafka.consumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user.toString()+"\n"+user.getDept()+"\n"+user.getName());
    }
}
