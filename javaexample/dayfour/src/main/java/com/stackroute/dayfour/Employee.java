package com.stackroute.dayfour;

public class Employee extends Person{

	String deptname;
	String dutytime;
	Employee()
	{
		deptname="TTR";
		dutytime="11pm to 7pm";
	}
	
	public void display()
	{
		System.out.println("Name " + name + " departname " + deptname + " duty timings " + dutytime);
	}
	
	public void setBonus()
	{
		System.out.println("2022-23 5% bonus");
		
	}
}
