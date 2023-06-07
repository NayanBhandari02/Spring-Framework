package com.example.spring;

import com.example.spring.game.gameRunner;
import com.example.spring.game.gamingConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application3SpringBeans {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConfig.class)) {
			context.getBean(gamingConsole.class).up();
			context.getBean(gameRunner.class).run();
		}

		SpringApplication.run(Application3SpringBeans.class, args);
	}

}
