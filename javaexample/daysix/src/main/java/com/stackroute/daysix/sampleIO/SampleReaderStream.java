package com.stackroute.daysix.sampleIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class SampleReaderStream {

	public static void main(String[] args) {

try
{
	FileReader fileread=new FileReader("hello.txt");
	BufferedReader bread=new BufferedReader(fileread);

	String line;
	   while( (line=bread.readLine()) != null)
		   System.out.println(line);
		   
	
}
catch(Exception e)
{
	System.out.println("Error " + e);
}
		
	}

}
