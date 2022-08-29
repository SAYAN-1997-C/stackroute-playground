package com.stackroute.daysix.sampleIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleSample {

	public static void main(String[] args) throws IOException {
		 
		InputStreamReader inputstream=new InputStreamReader(System.in);
		BufferedReader breader=new BufferedReader(inputstream);
		System.out.println("Enter something");
String ans=breader.readLine();
System.out.println("you entered " + ans);
	}

}
