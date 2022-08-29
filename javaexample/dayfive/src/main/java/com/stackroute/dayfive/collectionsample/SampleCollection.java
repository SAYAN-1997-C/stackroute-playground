package com.stackroute.dayfive.collectionsample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SampleCollection {

	public static void main(String[] args) {
		
		List mylist=new ArrayList();
		
		mylist.add("Apple");
		mylist.add(10);
		mylist.add("Orange");
		mylist.add("Apple");
	//	System.out.println(mylist);
		
		Set myset=new LinkedHashSet();
		
		myset.add("Sunday");
		myset.add("Monday");
		myset.add("Tuesday");
		myset.add("Friday");
		myset.add("Sunday");
		
		System.out.println(myset);
		
		Map country=new HashMap();
		
		country.put("in", "india");
		country.put("en","england");
		country.put("in","iceland");
		
		//System.out.println(country);
		
		

	}

}
