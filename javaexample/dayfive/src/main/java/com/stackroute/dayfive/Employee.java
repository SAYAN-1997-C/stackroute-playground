package com.stackroute.dayfive;

public class Employee {
  
	    int rollno;
	    String name;
	    int age;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	    
	  public void validateAge() throws InvalidAgeException
	  {
		  if(age<20)
			  throw new InvalidAgeException("Age can not be less than 20 for employment");
	  }
	
}
