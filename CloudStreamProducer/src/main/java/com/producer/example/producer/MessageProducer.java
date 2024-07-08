package com.producer.example.producer;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

import com.producer.example.dto.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageProducer {

    private static final String MESSAGES_BINDING_NAME = "producer-out-0";

    private final StreamBridge streamBridge;

    public MessageProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public Message createMessage(Message message) {
    	
        log.info("Producing message {} ...", message);
        boolean sent = streamBridge.send(MESSAGES_BINDING_NAME, message);

        if (sent) {
            log.info("Message sent!");
        } else {
            log.warn("Message sending failed!");
        }

        return message;
    }
}