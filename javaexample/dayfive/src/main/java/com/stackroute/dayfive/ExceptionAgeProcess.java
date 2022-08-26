package com.stackroute.dayfive;

public class ExceptionAgeProcess {

	public static void main(String[] args) {
	 
		Employee emp=new Employee();
		emp.setName("Binu");
		emp.setAge(12);
		emp.setRollno(12);
		try
		{
		emp.validateAge();
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
