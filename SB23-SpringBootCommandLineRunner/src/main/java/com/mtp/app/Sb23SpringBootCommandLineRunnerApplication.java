package com.mtp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mtp.app.service.MessageServiceProvider;

@SpringBootApplication
public class Sb23SpringBootCommandLineRunnerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Sb23SpringBootCommandLineRunnerApplication.class, args);
		MessageServiceProvider messageServiceProvider = configurableApplicationContext.getBean(MessageServiceProvider.class);
		String message = messageServiceProvider.message();
		System.out.println(message);
	}
}
