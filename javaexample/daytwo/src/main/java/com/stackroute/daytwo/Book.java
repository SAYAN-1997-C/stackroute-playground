package com.stackroute.daytwo;

import java.util.Scanner;

public class Book {
  public static void main(String ar[])
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("enter bookname, price ");
	  
	  String bookName=scan.nextLine();
	  
	  double price=scan.nextDouble();
	  scan.nextLine();
	  
	  
	  if (price>100)
		  System.out.println("Costly");
	  else
		  
		  System.out.println("Nominal");
	  
	  
	  System.out.println("enter Author's country");
	  
	  String country=scan.nextLine();
	  
	  switch(country.toUpperCase())
	  {
	  
	  case "INDIA":
		  			System.out.println("Indian Author . Prices in Rs");
		  			break;
	  case "US":
					System.out.println("American Author . Prices in $");
					break;
					
	  case "DENMARK":
					System.out.println("Europian Author . Prices in Euro");
					break;
		 
  		default:
  					System.out.println("Indian Author . Prices in Rs");
			break;
  			
	  
	  
	  }
	  
	  
	  
	  
  }
	
}
