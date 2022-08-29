package com.stackroute.daysix.sampleIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SampleObjectInputStream {

	public static void main(String[] args) {
	 
		FileInputStream fileinput;
		try
		{
		fileinput=new FileInputStream("empout.dat");
		ObjectInputStream objstream=new ObjectInputStream(fileinput);
		
             Employee empobj= (Employee)   objstream.readObject();
             
             System.out.println("read object " + empobj);
		}
	catch(Exception e)
		{
		
		}
		

	}

}
