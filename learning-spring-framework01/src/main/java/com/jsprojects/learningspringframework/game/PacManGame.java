package com.jsprojects.learningspringframework.game;

public class PacManGame implements GameInterfaceConsole {

	public void up(){
        System.out.println("You have gone up");
    }

    public void down(){
        System.out.println("You have sited");
    }

    public void left(){
        System.out.println("You have Decelerated");
    }

    public void right(){
        System.out.println("Click to Shoot");
    }
}
