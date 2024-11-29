package io.devsense.reactive_service_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReactiveServiceDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
		SpringApplication.run(ReactiveServiceDemoApplication.class, args);

		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		System.out.println(">>message = " + greetingClient.getMessage().block());
	}

}
