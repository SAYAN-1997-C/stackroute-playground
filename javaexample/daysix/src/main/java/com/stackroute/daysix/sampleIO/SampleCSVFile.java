package com.stackroute.daysix.sampleIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class SampleCSVFile {

	public static void main(String[] args) {
		 
		FileReader filereader;
		try
		{
			filereader=new FileReader("persondata.csv");
			BufferedReader breader=new BufferedReader(filereader);
			String line;
			 while ( (line=breader.readLine())!=null)
			 {
				String data[]=line.split(",");
				   
				  if(data[0].equals("Ruba"))
					  System.out.println("Interest of Person " + data[2]);
				 
			 }
		}
		
		catch(Exception e)
		{
			
		}
	}

}
