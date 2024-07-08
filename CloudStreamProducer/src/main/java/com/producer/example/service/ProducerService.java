package com.producer.example.service;

import com.producer.example.dto.Message;

public interface ProducerService {
	
	public Message produceMessage(Message message);

}
