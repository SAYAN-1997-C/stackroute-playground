package com.stackroute.daysix.sampleIO;

import java.io.Serializable;

public class Employee implements Serializable {
 
	
	public Employee(String empname, int age) {
		super();
		this.empname = empname;
		this.age = age;
	}


	String empname;
	 int age;
	 public Employee()
	 {
		 
	 }
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 

	 @Override
		public String toString() {
			return "Employee [empname=" + empname + ", age=" + age + "]";
		}
}
