package com.stackroute.daytwo;

public class Student {
	
	int rollNumber;
	String name;
	String address;
	
void setDetails(int roll,String name, String addr)
	{
	  this.rollNumber=roll;
	  this.name=name;
	  this.address=addr;
	  
		
	}


	void viewDetails()
	{
		System.out.println("Details of student : " + rollNumber + " name : " + name  + " address : " + address);
	}

}
