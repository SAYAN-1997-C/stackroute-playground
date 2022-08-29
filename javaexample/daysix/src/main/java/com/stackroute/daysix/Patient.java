package com.stackroute.daysix;

 

public class Patient implements Comparable<Patient> {
   String name;
   String symptom;
   int age;
   //CarType cartype;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public Patient()
{
	
}

public Patient(String name, String symptom,int age) {
	super();
	this.age=age;
	this.name = name;
	this.symptom = symptom;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSymptom() {
	return symptom;
}
public void setSymptom(String symptom) {
	this.symptom = symptom;
}
 


public String toString() {
	return "Patient [name=" + name + ", symptom=" + symptom + "age =" + age + "]";
}

public int compareTo(Patient patient2) {
	
	int  agenext=patient2.age;
	  
	  if(this.age==agenext)
		  return 0;
	  else if(this.age<agenext)
	      return 1;
	  else
		  return -1;
}

 

   
}
