package com.murali.learn.KafkaMessageProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	private static final String TOPIC = "NewTopic";
	
	@GetMapping("/publish/{message}")
	public String publishMessage(@PathVariable("message") String message) {
		kafkaTemplate.send(TOPIC,message);
		return "message published";
	}
}
