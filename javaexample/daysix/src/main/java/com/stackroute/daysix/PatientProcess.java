package com.stackroute.daysix;

import java.util.Collections;
import java.util.List;

public class PatientProcess {

	public static void main(String[] args) {

		List<Patient> patients=PatientRepository.getPatients();
		
		System.out.println(patients);

		
		
		patients.sort(new NameComparator());
		
	 

		
		
   //Collections.sort(patients);

   
   
   
//   System.out.println(patients);
		
		
		  for(Patient patobj : patients)
		  {
			  
		  }
   
	}

}
