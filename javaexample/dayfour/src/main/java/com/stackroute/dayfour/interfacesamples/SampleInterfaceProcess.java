package com.stackroute.dayfour.interfacesamples;

public class SampleInterfaceProcess {

	public static void main(String[] args) {
		
	
		
		//common behaviour
		
		iPrintable printobj=new Movie();
			new SampleInterfaceProcess().printingData( printobj);

	}

	void printingData(iPrintable printobj)
	{
		printobj.showDetails();
	}
	
}





//iPrintable print=new Animal();
//
//
//iPrintable print1=new Student();
//
//iPrintable print3=new Movie();
//