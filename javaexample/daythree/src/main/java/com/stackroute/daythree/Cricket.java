package com.stackroute.daythree;

public class Cricket extends Game{
	

	String matchName;
	  String venue;
	  
	  Cricket()
	  {
		  System.out.println("child class cricket - consturctor invoked");
		  gameType="outdoor";
		  gameName="cricket";
		  matchName="World cup";
		  venue="Australia";
	  }
	
	  

	  
	public String toString() {
		display();
		return "Cricket [matchName=" + matchName + ", venue=" + venue + "]";
	}

}
