package com.stackroute.dayfour.interfacesamples;

public class Movie implements iPrintable{

	String director;
	
	public void showDetails() {
		 
		//printerName="Inkjet printer";
		System.out.println("Printing moving details....."  + printerName);
		
	}

}
