package com.jsprojects.learningspringframework.gamespringbean;

import com.jsprojects.learningspringframework.game.GameInterfaceConsole;
import com.jsprojects.learningspringframework.game.GameRunner;
import com.jsprojects.learningspringframework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.jsprojects.learningspringframework.game")
public class AppSpringBeanGameUsingComponent {
	//Use @component to manage the objects and create the classes of the game instances
//	@Bean
//	public GameInterfaceConsole game(){
//		PacManGame pac = new PacManGame();
//		return pac;
//	}
//
//	@Bean
//	public GameRunner runGame(GameInterfaceConsole game){
//		GameRunner run = new GameRunner(game);
//		return run;
//	}

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(AppSpringBeanGameUsingComponent.class);

		//pacman
		context.getBean(GameInterfaceConsole.class).down();

		//runner class
		context.getBean(GameRunner.class).run();
	}

}
