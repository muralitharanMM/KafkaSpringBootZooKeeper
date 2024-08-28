package com.murali.learn.KafkaMessageConsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@KafkaListener(topics="NewTopic", groupId="group_id")
	public void consumeMessage(String message) {
		System.out.println("Message Received : "+message);
	}
}
