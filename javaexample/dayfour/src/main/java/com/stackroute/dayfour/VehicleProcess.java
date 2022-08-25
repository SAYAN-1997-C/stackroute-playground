package com.stackroute.dayfour;

public class VehicleProcess {

	public static void main(String[] args) {
	 
		Twowheeler twowheelobj=new Twowheeler();
		
		
		twowheelobj.setPolicy();
		twowheelobj.display2();
		
		
		Fourwheeler fourobj=new Fourwheeler();
		
		fourobj.setPolicy();
		fourobj.display4();

	}

}
