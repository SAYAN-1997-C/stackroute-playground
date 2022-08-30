package com.stackroute.dayseven_java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class SampleCommonfunctions {

	public static void main(String[] args) {
	 
	List<String> fruits= Arrays.asList("Apple","Orange","Mango","Banana");
	
//	fruits.forEach( str-> System.out.println (str));

	
	Map<String,String> states=new HashMap();
	states.put("b","Bangalore");
	states.put("h","Haryana");
	states.put("c","Calicut");
	
//	states.forEach( (key,val) -> System.out.println("Key is " + key + " value is " + val ) );
	
	ArrayList<Fooditem> listitems=(ArrayList) FoodRepository.getItems();
	
	
	
	//listitems.sort( (fobj1,fobj2) -> {return fobj2.getItemName().compareTo(fobj1.getItemName()) ;  } );
	
	listitems.sort((  (fobj1,fobj2)->   {
										if(fobj1.getPrice()==fobj2.getPrice())
												return 0;
										else if (fobj1.getPrice()>fobj2.getPrice())
										return 1;
										else
										return -1;
										}
							) );
	
	System.out.println(listitems);
	
	
	Predicate<Fooditem> preqty= fobj -> fobj.getQty()==1 ;
	listitems.removeIf( preqty);
	
	
//	or
// listitems.removeIf(fobj -> fobj.getQty()==1  );
	
	
	System.out.println("current listitem ");
	System.out.println(listitems ) ;
	
	
	
	
	
	
	}

}
