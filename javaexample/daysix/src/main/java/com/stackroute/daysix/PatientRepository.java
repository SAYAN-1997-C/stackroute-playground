package com.stackroute.daysix;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository {
 
static	List<Patient> patients=new ArrayList<Patient>();
	
	public static List getPatients()
	{
		patients.add(new Patient("Ravi","Fever",40));
		patients.add(new Patient("Arun","Cold",15));
		patients.add(new Patient("Livis","Fever",26));
		
		
		return patients;
	}
	 
	
	
	
}
