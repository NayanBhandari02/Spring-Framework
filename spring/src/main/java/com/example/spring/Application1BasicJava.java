package com.example.spring;

import com.example.spring.game.gameRunner;
import com.example.spring.game.pacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application1BasicJava {

	public static void main(String[] args) {

		//marioGame game = new marioGame();
		//contraGame game = new contraGame();
		pacmanGame game = new pacmanGame();
		gameRunner gamerunner = new gameRunner(game);
		gamerunner.run();

		SpringApplication.run(Application1BasicJava.class, args);
	}

}
