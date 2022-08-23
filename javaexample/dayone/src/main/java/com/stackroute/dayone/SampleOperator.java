package com.stackroute.dayone;

public class SampleOperator {

	public static void main(String[] args) {
	 
		int num;
		float average;
		
		num=10;
		average=10/2.5f;
		
	//	System.out.println("Average is " + average);
		
		int age=-10;
		int salary=5000;
		
		//short circuit operations
//		
//		if ((age<0) || (salary<1000) )
//		System.out.println("Invalid input");
	 
		      	        			
//		if ((salary>7000) && ( (age<=0) || (salary<10000)) )
//			System.out.println("Validate Input");
//		else
//			System.out.println("Inputs are correct");
//		
		
//		
//	String ans=(salary>5000)?"Basic" : "Below Average";
//	System.out.println("salary type is " + ans);
//	
	
		long days=1;
		int duration=(int)days;
		
		
//		for (int i=1;i<=10;i++)
//		{
//			 System.out.println( "i val is " + i);
//		}
		
		int number=1;
		int ans=0;
	while(number<5)
		{
			 
			 
			ans=ans + (number * number );
					 System.out.println(ans);
			
					 number++;
		}
		
		
	}

}
