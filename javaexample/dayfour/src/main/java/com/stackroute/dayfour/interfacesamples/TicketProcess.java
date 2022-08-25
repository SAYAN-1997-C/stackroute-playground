package com.stackroute.dayfour.interfacesamples;

import java.util.Scanner;

public class TicketProcess {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter login 1- admin , 2 - passenger ");
		
		int choice=scan.nextInt();
		
		Ticket ticketobj=new Ticket();
	 
		
		if (choice==1)
		{
			iAdmin admin=new Ticket(100,"Pune","Delhi","Delhi Express");
			
			admin.setDuty();
			admin.setPrice(300);
			admin.showDetails();
			
		}
		else if (choice==2)
		{
			iPassenger passenger=new Ticket(100,"Pune","Delhi","Delhi Express");
			
			passenger.bookTicket(10);
			passenger.showDetails();
		}
		

	}

}
