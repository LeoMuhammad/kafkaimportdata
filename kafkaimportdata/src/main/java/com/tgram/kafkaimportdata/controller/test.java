package com.tgram.kafkaimportdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping("/")
    public void send() {
        for (int i = 0; i < 20; i++) {
            kafkaTemplate.send("test2", i+"");
        }
    }
}
