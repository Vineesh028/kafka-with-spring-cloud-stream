package com.producer.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producer.example.dto.Message;
import com.producer.example.producer.MessageProducer;
import com.producer.example.service.ProducerService;

@Service
public class ProducerServiceImpl implements ProducerService {

    private final MessageProducer messageProducer;

    @Autowired
    public ProducerServiceImpl(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @Override
    public Message produceMessage(Message message) {
    	
    	return messageProducer.createMessage(message);
    }
}