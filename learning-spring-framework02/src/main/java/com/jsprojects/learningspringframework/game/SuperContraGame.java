package com.jsprojects.learningspringframework.game;

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
