package com.example.spring;

import com.example.spring.game.gameRunner;
import com.example.spring.game.gamingConsole;
import com.example.spring.game.pacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public gamingConsole game(){
        var game = new pacmanGame();
        return game;
    }

    @Bean
    public gameRunner GameRunner(){
        var GameRunner = new gameRunner(game());
        return GameRunner;
    }
}
