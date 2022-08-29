package com.stackroute.java8samples;


@FunctionalInterface
interface iPassenger
{
	public void showDetails();
	
 
	
	default void commonPolicy()
	{
		System.out.println("Passenger to reach aiport before 2 hrs of dispatcher time ");
	}
	
	default String getFlight()
	{
		return "Indigo";
	}
}

public class SampleFunctionalInter {

	public static void main(String[] args) {
	
		
		iPassenger passobj=new iPassenger()
								{

									@Override
									public void showDetails() {
								   System.out.println("flights are not avialble today");
										
									}
 
										
								};
								
			passobj.commonPolicy();
			passobj.showDetails();
			

	}

}
