package com.stackroute.dayfour;

public class Passenger extends Person {

	  int nooftickets;
	  String pnr;
	    
	    Passenger()
	    {
	    	nooftickets=1;
	    	pnr="pn111";
	    }
	  
	    public void display()
	    {
	    	System.out.println("name " + name + " age " + age +  " pnr number " + pnr );
	    }
	    
	    void covidRule()
	    {
	    	System.out.println("Pillows and Bed sheets will not be given");
	    }
	    
}
