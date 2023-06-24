package com.jsprojects.learningspringframework.gamespringbean;

import com.jsprojects.learningspringframework.game.GameInterfaceConsole;
import com.jsprojects.learningspringframework.game.GameRunner;
import com.jsprojects.learningspringframework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public GameInterfaceConsole game(){
        PacManGame pac = new PacManGame();
        return pac;
    }

    @Bean
    public GameRunner runGame(GameInterfaceConsole game){
        GameRunner run = new GameRunner(game);
        return run;
    }

}
