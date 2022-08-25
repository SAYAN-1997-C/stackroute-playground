package com.stackroute.dayfour.interfacesamples;

interface iMyinter
{
	 void display();
	 void setDetails();
}


class Book implements iMyinter
{
	
	public void setPrice()
	{
		System.out.println("setting price .... ");
	}

	public void display() {
		 
		System.out.println("Display book data");
		
	}

	public void setDetails() {
	 
		System.out.println("get the  book data");
		
	}
	
	
	
}


public class InterfaceExample {

	public static void main(String[] args) {
	
		// tightly coupled
		Book bookobj=new Book();
		bookobj.setDetails();
		bookobj.display();
		bookobj.setPrice();
		
		    //or
		
		//loosely coupled
		iMyinter ibookobj=new Book();
		ibookobj.setDetails();
		
	}

}
