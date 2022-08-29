package com.stackroute.dayfive.collectionsample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PatientService {

	List<Patient> patients=new ArrayList<Patient>();
	
	
	public PatientService()
	{
		patients=PatientRepository.getPatients();
	}
	
	
	public void addPatient(Patient patientnew)
	{
		patients.add(patientnew);
	}
	
	
	public void removePatient(String name)
	{
		ListIterator<Patient> literate=patients.listIterator();
		
		while(literate.hasNext())
		{
	
			Patient patientobj= literate.next();
			   
			   if(patientobj.getName().equals(name))
				   literate.remove();
		}
	}
	
	public void displayAll()
	{
		for(Patient patobj : patients)
		{
			System.out.println(patobj);
		}
		
	}
	
}
