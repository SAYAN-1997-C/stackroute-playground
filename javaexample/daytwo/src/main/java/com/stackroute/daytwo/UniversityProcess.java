package com.stackroute.daytwo;

public class UniversityProcess {

	public static void main(String[] args) {
	/* 	
	//object creation
		Student student,student1,student2;
		
		//instantiation
		
		student=new Student(); // memory allotted
		
		//calling method with parameter
		
	 student.setDetails(10, "Vikram", "Delhi");
	//calling method
     student.viewDetails();
     
     
     student1=new Student();
     student1.setDetails(20, "dan", "Blore");
      student1.viewDetails();
     */

		/*
     Employee employee=new Employee();
		employee.setData("Usha", 7500);
		
		employee.displayData();
	 */
		
	College college=new College();
	college.setCollegeName("SSN College");
	college.setLocation(" ");
	college.setStrength(3000);
	
	
	//System.out.println( "College name is "+  college.getCollegeName() + " Location is " + college.getLocation());
	
	System.out.println(college);
	
	
	College college1=new College();
	college1.setCollegeName("NIT Trichy");
	college1.setLocation("Trichy");
	college1.setStrength(4000);
	

	System.out.println(college1);
	
	}

}
