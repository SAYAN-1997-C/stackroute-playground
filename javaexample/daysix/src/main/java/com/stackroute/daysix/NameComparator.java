package com.stackroute.daysix;

import java.util.Comparator;

public class NameComparator implements Comparator  {

	public int compare(Object obj1, Object obj2) {
   
		 Patient person1=(Patient) obj1;
		 Patient person2=(Patient) obj2;
		 
 
		return person2.getName().compareToIgnoreCase(person1.getName());
	
	}

}