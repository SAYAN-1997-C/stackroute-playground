package com.stackroute.dayfour;

public class Twowheeler extends Engine{

	String model="X-caliber";

	 
	public void setPolicy() {
		company="Suzuki";
		 
		warranty=2;
	}
	
	public void display2()
	{
		System.out.println("Company  " +  company +  "  year warranty " + warranty );
	}

}
