package com.stackroute.java8samples;

abstract class Engine
{
	   String engtype;
	   abstract void setSpeed();
	
}

//class Car extends Engine
//{
//
//	@Override
//	void setSpeed() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


public class SampleAnonym {

	public static void main(String[] args) {
		 
	//	Engine engobj=new Car();
		
		//anonymous class
		
		Engine engobj=new Engine()
							{

								@Override
								void setSpeed() {
									System.out.println("Speed is 10km/hr");
									
								}
								
							};
		
		engobj.setSpeed();
		
		
							
							
	}

}
