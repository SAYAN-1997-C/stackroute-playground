package com.stackroute.dayfive;

import java.util.Scanner;

public class SampleException {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		int a,b,c;
		
		a=scan.nextInt();
		//b=scan.nextInt();
	
	
		
		
		try
		{
			b=Integer.parseInt("num");
		c=a/b;
		System.out.println("Answer " + c);
		
		System.out.println("given number " + a  + " and " + b );
		}
	

		catch(ArithmeticException excep)
		{
			System.out.println("Divisor is zero, please change");
		}
		catch(NumberFormatException excep)
		{
			System.out.println("Invalid number");
		}
		catch(Exception excep)
		{
			System.out.println("Some error occured. check your input " + excep );
		}

		finally
		{
			 System.out.println("Process completed");
		}
		
		System.out.println("Welcome ");
		
	}

}
