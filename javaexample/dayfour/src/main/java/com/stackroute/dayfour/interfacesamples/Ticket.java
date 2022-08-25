package com.stackroute.dayfour.interfacesamples;


interface iPassenger
{
	 abstract void bookTicket(int count);
	void cancelTicket(int num);
	  void showDetails();
}

interface display
{
	
}
interface iAdmin extends iPassenger,display
{
	  void setPrice(int pri);
	  void setDuty();
}

public class Ticket implements iPassenger, iAdmin {
	
	  int available;
	  String source;
	  String destination;
	  String trainname;
	  int price;
	  
	  Ticket()
	  {
		  
	  }
	  
	  Ticket(int cnt,String sour,String dest,String train)
	  {
		  this.available=cnt;
		  this.source=sour;
		  this.destination=dest;
		  this.trainname=train;
		  

	  }

	  public void bookTicket(int number)
	  {
		  this.available=available-number;
	  }
	  
	  public void cancelTicket(int number)
	  {
		  this.available+=number;
	  }
	  
	  public void setPrice(int price)
	  {
		  this.price=price;
	  }
	  public void showDetails()
	  {
		  System.out.println("Train name " + trainname + " source " + source + " destination " + destination + " avaiable " + available);
	  }
	  
	  public void setDuty()
	  {
		  System.out.println ("Allotted to Southe Zone - 28th Aug ");
	  }
	  
}
