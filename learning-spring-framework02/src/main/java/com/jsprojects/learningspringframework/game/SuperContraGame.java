package com.jsprojects.learningspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame")
public class SuperContraGame implements GameInterfaceConsole{

	 public void up(){
	        System.out.println("Jump");
	    }

	    public void down(){
	        System.out.println("Sit");
	    }

	    public void left(){
	        System.out.println("Decelerate");
	    }

	    public void right(){
	        System.out.println("Shoot");
	    }

}
