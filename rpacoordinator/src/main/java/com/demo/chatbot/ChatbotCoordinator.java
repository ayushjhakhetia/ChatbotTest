package com.demo.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotCoordinator {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/dialogflow");
		SpringApplication.run(ChatbotCoordinator.class, args);
	}

}
