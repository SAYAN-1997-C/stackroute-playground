package com.stackroute.daytwo;

import java.util.Scanner;

public class AdmissionProcess {

	public static void main(String[] args) {
	 
		String subjects;
		String studentName;
		String department;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter subjects  , studentname , opted department");
		
		subjects=scan.nextLine();
		
		studentName=scan.nextLine();
		
		department=scan.nextLine();
	
		
		if (studentName==null || subjects==null || department==null || department.isEmpty() || 
				 department.isBlank() || department.length()<3)
		{
			System.out.println("Invalid data . plz check");
		}
		else
		{
			
				if (subjects.contains("computer"))
					System.out.println("Eligible for Computer Science engineering");
				else if (subjects.contains("maths"))
					System.out.println("Eligible for any engineering");


		}
		
		
		String subjectlist[] = subjects.split(",");
		
		for (int i=0;i<subjectlist.length;i++)
			System.out.println(subjectlist[i]);
		
		
		
	}

}
