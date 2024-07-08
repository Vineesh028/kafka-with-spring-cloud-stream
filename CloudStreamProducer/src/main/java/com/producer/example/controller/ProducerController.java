package com.producer.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.example.dto.Message;
import com.producer.example.service.ProducerService;

@RestController
@RequestMapping("/producer-service")
public class ProducerController {

    private final ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping(path = "/send")
    public Message produceMessage(@RequestBody Message message) {
        return producerService.produceMessage(message);
    }
}