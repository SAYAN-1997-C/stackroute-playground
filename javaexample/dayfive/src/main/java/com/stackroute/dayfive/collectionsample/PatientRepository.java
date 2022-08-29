package com.stackroute.dayfive.collectionsample;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
 
static	List<Patient> patients=new ArrayList<Patient>();
	
	public static List getPatients()
	{
		patients.add(new Patient("Ravi","Fever"));
		patients.add(new Patient("Arun","Cold"));
		patients.add(new Patient("Livis","Fever"));
		
		
		return patients;
	}
	 
	
	
	
}
