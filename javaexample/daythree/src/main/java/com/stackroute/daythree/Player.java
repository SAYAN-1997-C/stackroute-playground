package com.stackroute.daythree;

public class Player {

	
	private int playerId;
	 private String playerName;
	 private String skills;
	 private int matches;
	 
	 // constructor overloading : 3 constructors
	public Player()
	 {
		 playerId=10;
		 playerName="sachin";
		 skills="Bating";
		 matches=300;
	 }
	//method signature : 4 arguments, order int,string,stirng,int
	public Player(int pid,String pname,String skills,int match)
	{
		this.playerId=pid;
		this.playerName=pname;
		this.skills=skills;
		this.matches=match;
	}
	
	//method signature : 2 arugments, order int,string
	public Player(int pid,String pname)
	{
		 this.playerId=pid;
		 this.playerName=pname;
		 
	}
	 
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	 
	 private void allotMatch()
	 {
		 System.out.println("Going to play for 20-20");
	 }
 
		public String toString() {
			
			if(matches>10)
			allotMatch();
			
			return "Player [playerId=" + playerId + ", playerName=" + playerName + ", skills=" + skills + ", matches="
					+ matches + "]";
			
						
			
		}
}
