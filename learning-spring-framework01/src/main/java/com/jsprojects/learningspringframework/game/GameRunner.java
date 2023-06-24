package com.jsprojects.learningspringframework.game;

public class GameRunner {
	
	GameInterfaceConsole game;

	public GameRunner(GameInterfaceConsole game) {
		this.game = game;
	}
	
	public void run(){
        game.left();
        game.up();
        game.right();
        game.down();
    }
	

}
