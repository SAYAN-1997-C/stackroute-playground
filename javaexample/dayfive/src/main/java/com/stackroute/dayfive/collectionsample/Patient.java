package com.stackroute.dayfive.collectionsample;

public class Patient {
   String name;
   String symptom;
   //CarType cartype;

public Patient(String name, String symptom) {
	super();
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
	return "Patient [name=" + name + ", symptom=" + symptom  +"]";
}

   
}
