package com.stackroute.daythree;

public class Game {
        
	String gameType;
	String gameName;
	
	public Game()
	{
		System.out.println("parent class-game - default constructor  invoked");
	}
	

	public Game(String gameType, String gameName) {
		System.out.println("parent class-game - parameterized constructor  invoked");

	 		this.gameType = gameType;
		this.gameName = gameName;
	}
	
	
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
 
 
 
	public void display() {
		System.out.println( "Game [gameType=" + gameType + ", gameName=" + gameName + "]");
	}
}
