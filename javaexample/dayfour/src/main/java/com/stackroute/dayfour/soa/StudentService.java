package com.stackroute.dayfour.soa;

public class StudentService implements iRegister {
	
	Student student;

	// factory method
	public Student createStudent() {
	    
		student=new Student();
		return student;
	}

	public void setFees(Student student) {
     if (student.getCourse().equals("Engineering"))
    	 System.out.println("Fees 1L");
     else
    	 System.out.println("Fees  50k");
		
	}

	public void showDetails(Student student) {
		
		
		System.out.println(student.getName() + student.getCourse() );
		
	}

}
