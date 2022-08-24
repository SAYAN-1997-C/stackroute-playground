package com.stackroute.daythree;

public class TeamProcess {

	public static void main(String[] args) {
		 
		Player player1=new Player();
		
	//	System.out.println(player1);
		
		Player player2=new Player(20,"Rahul","Bowling",350);
		
	//	System.out.println(player2);
		
		Player player3=new Player(30,"Dhoni");
		
		System.out.println(player3);

		Calculator calculate=new Calculator();
		calculate.add("India" , 75);
		
	}

}
