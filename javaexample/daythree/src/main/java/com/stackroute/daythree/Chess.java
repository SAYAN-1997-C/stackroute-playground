package com.stackroute.daythree;

public class Chess extends Game {
	String location;
	
//	
	Chess()
	{
		System.out.println("Inside chess child class constructor");
	}
	
	
	Chess(String loca,String gametype,String game)
	{
		super(gametype,game);
	}
	
	//method overriding
	
	public void display()
	{
	    	
		super.display();
		System.out.println("Location is Chennai");
	}

}


class Tournament extends Chess
{
	String season;
	
	  Tournament()
	  {
		  season="Winter";
		  location="Delhi";
		  gameName="Chess-Worldcup";
		  gameType="Indoor";
		  
	  }
	
	   void viewDetails()
	   {
		   display();
	   }
	
}


