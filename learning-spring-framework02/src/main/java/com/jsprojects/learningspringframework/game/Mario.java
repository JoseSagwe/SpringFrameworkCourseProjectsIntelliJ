package com.jsprojects.learningspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Use @Primary to give priority to a bean to be retrieved
@Primary

public class Mario implements GameInterfaceConsole{

	 public void up(){
	        System.out.println("Go up");
	    }

	    public void down(){
	        System.out.println("Go down");
	    }

	    public void left(){
	        System.out.println("Go back");
	    }

	    public void right(){
	        System.out.println("Accelerate");
	    }

}
