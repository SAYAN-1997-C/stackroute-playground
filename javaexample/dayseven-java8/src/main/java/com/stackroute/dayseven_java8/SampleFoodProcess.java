package com.stackroute.dayseven_java8;

import java.util.List;
import java.util.function.Predicate;

public class SampleFoodProcess {

	public static void main(String[] args) {
	 
		List<Fooditem> listfood=FoodRepository.getItems();
		
		Predicate<Fooditem> precostly = (foodobj) -> foodobj.getPrice()>100; 
		
    
		 for (Fooditem fobj : listfood )
		 {
			 
			   if (precostly.test(fobj))
			   System.out.println("costly "  + fobj);
			   else
				   System.out.println("nominal price "  + fobj);
			 
			 
		 }
		

	}

}






//Fooditem fooditem=new Fooditem("Naan",140,2,"Breakfast");
//
//if (precostly.test(fooditem))
//	System.out.println ("Costly item " + fooditem );
//else
//	System.out.println("Nominal price " + fooditem );