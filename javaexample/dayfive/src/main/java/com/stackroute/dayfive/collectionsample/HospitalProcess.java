package com.stackroute.dayfive.collectionsample;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class HospitalProcess {

	public static void main(String[] args) throws IOException{
	
		PatientService pservice=new PatientService();
		
	
		char ans='n';
		Scanner scan=new Scanner(System.in);
	
	do
		{ 
		System.out.println("Enter your choice 1-add, 2- delete, 3-view");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		

		case 1:
					{	
						scan.nextLine();
						System.out.println("Enter new patient name and symptom");
				
						Patient patientnew=new Patient(scan.nextLine(),scan.nextLine());
						
						pservice.addPatient(patientnew);
						break;
						
					}
		case 2:
				{
					scan.nextLine();
					System.out.println("Enter name to be deleted");
					String name=scan.nextLine();
					pservice.removePatient(name);
					break;
				}
		case 3:
			
					{
						pservice.displayAll();
						break;
					}
		
			}

		System.out.println("Want to continue y- yes n-no ?");
		
		ans=(char)System.in.read();
		
		} while (ans=='y');
		
	}

}


