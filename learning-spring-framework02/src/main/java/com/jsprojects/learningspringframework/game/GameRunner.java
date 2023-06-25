package com.jsprojects.learningspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GameInterfaceConsole game;

	public GameRunner(@Qualifier("SuperContraGame") GameInterfaceConsole game) {
		this.game = game;
	}
	
	public void run(){
        game.left();
        game.up();
        game.right();
        game.down();
    }
	

}
