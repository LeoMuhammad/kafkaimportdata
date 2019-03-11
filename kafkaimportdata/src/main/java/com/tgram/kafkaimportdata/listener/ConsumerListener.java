package com.tgram.kafkaimportdata.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @KafkaListener(topics = {"${kafka.consumer.topic}"})
    public void test(ConsumerRecord<?,?> record){
        System.out.println(record);
    }
}
