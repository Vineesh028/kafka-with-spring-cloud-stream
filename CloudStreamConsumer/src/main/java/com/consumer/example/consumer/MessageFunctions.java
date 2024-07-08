package com.consumer.example.consumer;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.consumer.example.dto.Message;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class MessageFunctions {


    @Bean
    public Function<Message,Message> messageConsumer() {
        return message -> {
            log.info("Received " +  message);
            return message;
        };
    }



}