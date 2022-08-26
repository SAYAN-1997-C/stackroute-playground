package com.stackroute.dayfive;

public class Patient {

	int rollno;
	String name;
	String symptoms;
	static String hospitalname;
	static int count;
	
	


	public Patient()
	{
		
	}
	
	public Patient(int rollno, String name, String symptoms, String hospitalname) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.symptoms = symptoms;
		this.hospitalname = hospitalname;
	//	this.count = count;
	}
	public void admit()
	{
		count++;
		
	}
	
	public static void display()
	{
		System.out.println("Hospital name " + hospitalname + " Location " + " Mumbai " + "Count is " + count);
	}
	
	
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
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Patient [rollno=" + rollno + ", name=" + name + ", symptoms=" + symptoms + ", hospitalname="
				+ hospitalname + "]";
	}

}
