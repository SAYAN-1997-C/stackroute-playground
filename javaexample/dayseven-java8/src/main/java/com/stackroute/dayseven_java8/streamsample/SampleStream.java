package com.stackroute.dayseven_java8.streamsample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SampleStream {

	public static void main(String[] args) {
 
		List<String> colours=Arrays.asList("Red","Black","Orange","Blue","Rose");
		
		
		
	long ans=	colours.stream().filter( str-> str.startsWith("R")).count();
		
	//	System.out.println("Colors starts with B is  " + ans );
		
	
	List<String> listcolor=	colours.stream().filter( col -> col.length()>3).collect(Collectors.toList());
	
//	System.out.println (listcolor);
	
	
	List<Fooditem> itemslist= FoodRepository.getItems();
	
	
	List<Fooditem> sweetlist= itemslist.stream().filter( fobj -> fobj.getType().equals("Sweet") ).collect(Collectors.toList());
	
	//System.out.println(sweetlist);
	

	boolean ftype=itemslist.stream().anyMatch( fobj-> fobj.getType().equals("Dinner"));
	
//	 if(ftype)
//		 System.out.println("dinner is available");
//	 else
//		 System.out.println("Dinner not available");
	
	
	 boolean ftype1=itemslist.stream().skip(3).anyMatch( fobj-> fobj.getType().equals("Tiffin"));
		
	 //System.out.println(ftype1);
	 
	 Optional<Fooditem> optionobj=   itemslist.stream().filter( fobj-> fobj.getPrice()<100 ).findFirst();
	 
	 if (optionobj.isPresent())
		 System.out.println(optionobj.get());
		 
	 
	}

}
