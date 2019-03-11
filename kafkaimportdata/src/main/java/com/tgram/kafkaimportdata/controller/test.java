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
    public void send(){
        kafkaTemplate.send("test","aaaa");
    }
}
