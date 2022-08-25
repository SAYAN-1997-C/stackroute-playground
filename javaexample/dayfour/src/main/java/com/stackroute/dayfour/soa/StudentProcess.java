package com.stackroute.dayfour.soa;

public class StudentProcess {

	public static void main(String[] args) {

		iRegister register=new StudentService();
		
		Student student=register.createStudent();
		
		student.setName("Annu");
		student.setCourse("Engineering");
		
		register.setFees(student);
		register.showDetails(student);

	}

}
