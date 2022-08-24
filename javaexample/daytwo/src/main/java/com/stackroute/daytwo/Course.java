package com.stackroute.daytwo;

import java.util.Scanner;

public class Course {

	Scanner scan=new Scanner(System.in);
	
	public static void main(String s[])
	{
		Course course=new Course();
		
		System.out.println("Enter coursename and duration ");
		String name=course.getInput();
		String duration=course.getInput();
		
		
		course.display(name,duration);
	}
	
	
	String getInput()
	{

		return scan.nextLine();
	}
	
	void display(String nm,String dura)
	{
		System.out.println("course name is " + nm + " Duration is " + dura);
	}
	
	
}
