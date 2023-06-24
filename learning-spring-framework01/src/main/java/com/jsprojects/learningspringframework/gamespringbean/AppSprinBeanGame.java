package com.jsprojects.learningspringframework.gamespringbean;

import com.jsprojects.learningspringframework.game.GameInterfaceConsole;
import com.jsprojects.learningspringframework.game.GameRunner;
import com.jsprojects.learningspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSprinBeanGame {

	public static void main(String[] args) {
	
		var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

		//pacman
		context.getBean(GameInterfaceConsole.class).down();

		//runner class
		context.getBean(GameRunner.class).run();
	}

}
