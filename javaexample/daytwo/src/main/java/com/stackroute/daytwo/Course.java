package com.stackroute.daytwo;

import java.util.Scanner;

public class Course {

	Scanner scan=new Scanner(System.in);
	
	public static void main(String s[])
	{
		Course course=new Course();
		
		String name=course.getInput();
		String duration=course.getInput();
		
		
		course.display(name,duration);
	}
	
	
	String getInput()
	{
		System.out.println("Enter course name");
		return scan.nextLine();
	}
	
	void display(String nm,String dura)
	{
		System.out.println("course name is " + nm + " Duration is " + dura);
	}
	
	
}
