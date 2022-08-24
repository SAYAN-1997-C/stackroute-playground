package com.stackroute.daythree;

import java.util.Scanner;

public class CrickApp {

	public static void main(String[] args) {
  
	   Player players[]=new Player[3];
	   
	   for (int i=0;i<=2;i++)
	   {
		   players[i]=new Player();
		   
	   }
		
	   Scanner scan=new Scanner(System.in);
	   for (int i=0;i<=2;i++)
	   {
		   System.out.println("Enter playerid,name");
		  
		 
		   players[i].setPlayerId(scan.nextInt());
		   scan.nextLine();
		   players[i].setPlayerName(scan.nextLine());
	
		   
	   }
	   
	  
	   
for(int i=0;i<=2;i++)
	System.out.println(players[i]);
	   
	}

}
