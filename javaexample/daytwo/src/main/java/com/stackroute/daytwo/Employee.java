package com.stackroute.daytwo;

public class Employee {
	
	String empName;
	int salary;
	
	//method with param
	void setData(String ename,int sal)
	{
		this.empName=ename;
		this.salary=sal;
	}
// method with return 
	double calcuBonus()
	{
		if (salary<5000)
			return salary*10/100;
		else if(salary<7000)
			return salary* 7/100;
		else
			return salary*5/100;
		
	}
	//method with no param no return value
	void displayData()
	{
		System.out.println("emp name " + empName + " salary is " + salary);
		double bonus=calcuBonus();
		System.out.println("Bonus is " + bonus);
	}
	
	
	
}
