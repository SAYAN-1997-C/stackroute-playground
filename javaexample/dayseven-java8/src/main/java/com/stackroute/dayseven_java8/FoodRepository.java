package com.stackroute.dayseven_java8;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {

	static List<Fooditem> fooditems=new ArrayList();
	
	static List<Fooditem> getItems()
	{
	     fooditems.add( new Fooditem("Cake",120,1,"Sweet"));
	     fooditems.add(new Fooditem("Rotti",50,2,"Tiffin"));
	     fooditems.add(new Fooditem("Juice",79,1,"Drinks"));
	     fooditems.add(new Fooditem("Laddu",450,1,"Sweet"));
	     
	     return fooditems;
	}
	
}
