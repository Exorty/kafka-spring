package com.kafkaspring.kafkaspring;

import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "ecommerce.cliente-2", groupId = "ecommerce.groupId")
    public void consumer(String message) {
        System.out.println(message);
    }

}
