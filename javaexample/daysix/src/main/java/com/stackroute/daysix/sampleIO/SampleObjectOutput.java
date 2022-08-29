package com.stackroute.daysix.sampleIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SampleObjectOutput {

	public static void main(String[] args) {
	 
		FileOutputStream fileobj;
		try
		{
		fileobj=new FileOutputStream("empout.dat");
		ObjectOutputStream objout=new ObjectOutputStream(fileobj);
		
		Employee emp=new Employee("Dan",21);
		
		objout.writeObject(emp);
		
		System.out.println("Employee object stored in a file ");
		

		}
		catch(Exception e)
		{
			
		}
	}
	

}
