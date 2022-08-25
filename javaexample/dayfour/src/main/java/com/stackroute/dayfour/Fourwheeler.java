package com.stackroute.dayfour;

public class Fourwheeler extends Engine {

	String model="BMW";
	
	
 
	public void setPolicy() {
		warranty=10; 
		
	}
	
	
	public void display4()
	{
		System.out.println(" model " + model + "  warranty in years " + warranty);
	}

}
