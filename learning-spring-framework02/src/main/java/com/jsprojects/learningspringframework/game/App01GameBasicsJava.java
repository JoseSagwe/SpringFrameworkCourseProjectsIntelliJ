package com.jsprojects.learningspringframework.game;

public class App01GameBasicsJava {

	public static void main(String[] args) {
	
		//Mario game = new Mario();
//		PacManGame game = new PacManGame();
		SuperContraGame game = new SuperContraGame();
		
		GameRunner rung = new GameRunner(game);
		rung.run();
	}

}
