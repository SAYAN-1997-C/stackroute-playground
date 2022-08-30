package com.stackroute.dayseven_java8.streamsample;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FoodAnalysisProcess {

	static List<Fooditem> items=FoodRepository.getItems();
	
	public static void main(String[] args) {

//1) list fooditems of given type

     Optional<List<Fooditem>> resulttype=  findFoodbyType("Tiffin");
     
     if (resulttype.isPresent())
    	 System.out.println(resulttype.get());
     
   //  System.out.println(resulttype);
     
     
  //   2) display the itemnames with qty > given qty
     
   List<String> itemslist= findItemNameByQty(5);
  //   System.out.println(itemslist);
     

     
  //   3) display the item with highest price
     //findCostlyItem();
     
    // findCostly2();
     
     
     //4) sort the fooditems based on price
  //   sortByPrice();
     
     
  //   5) sort the items based on price where type is  not sweet
  //   sortByPriceNotSweet();
   
   
   
   // 6. return string of itemnames separated by :
     //  getAllItemNames();
   
   
   //7. retun map with itemname and type 
   
   getItemMapWithNameandType();
	}
	
	
	public static Optional<List<Fooditem>> findFoodbyType(String type)
	{
		 
	List<Fooditem> resultitems=	  items.stream().filter( fobj-> fobj.getType().equals(type)).collect(Collectors.toList());
	
	if(!resultitems.isEmpty())
	return Optional.of(resultitems);
	else
		return Optional.empty();
		
	}
	
	public static List<String> findItemNameByQty(int qtygiven)
	{
		
	List<String> itemnames=items.stream().filter( fobj-> fobj.getQty()> qtygiven ).map( fitemobj -> fitemobj.getItemName() ).collect(Collectors.toList());
		return itemnames;
		
		
	}
	
	public static void findCostlyItem()
	{
	 OptionalInt optprice=	items.stream().mapToInt( fobj-> fobj.getPrice() ).max();
	 int pri;
	  if(optprice.isPresent())
	  {
		  pri=optprice.getAsInt() ;
	    System.out.println("highest price " + pri );
	    
	    items.forEach( fobj-> {
	    	  if (fobj.getPrice()==pri)
	    		  System.out.println(fobj);
	    });
	 
	  }
	  
	}
	
	
	  public static void findCostly2()
	  {
		  
	Optional<Fooditem> resultitem=	  items.stream().max( (f1,f2) -> {
																	if(f1.getPrice()>f2.getPrice())
																			return 1;
																		else
																			return -1;
			  			  												});
	if (resultitem.isPresent())
		System.out.println(resultitem.get());
	
	
	  }
	    
	  
	  public static void sortByPrice()
	  {
		  
//	List<Integer> sortedprice=	  items.stream().map( Fooditem::getPrice ).sorted().collect(Collectors.toList());

	List<Integer> sortedprice=	  items.stream().map( Fooditem::getPrice ).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(sortedprice);
	
	List<String> sortedname = items.stream().map( Fooditem :: getItemName).sorted().collect(Collectors.toList());
	
	System.out.println(sortedname) ;
	
	
	LinkedList<Fooditem> sorteditems=items.stream().sorted(  Comparator.comparing( fobj -> fobj.getItemName())).collect(Collectors.toCollection( LinkedList::new));
	System.out.println(sorteditems);
	
	  }
	  
	  public static void sortByPriceNotSweet()
	  {
		  
			List<Fooditem> sorteditems=items.stream().filter( fobj->!fobj.getType().equals("Sweet")).sorted(  Comparator.comparing( fobj -> fobj.getItemName())).collect(Collectors.toList());

			System.out.println(sorteditems);
	  }
	

	  public static      void  getAllItemNames()
	  {
		 String result=    items.stream().map( fobj->fobj.getItemName() ).collect(Collectors.joining(":"));
		 System.out.println(result);
	  }
	  
	  public static void getItemMapWithNameandType()
	  {
		  
	Map<String,String> resultmap=	  items.stream().collect(Collectors.toMap( Fooditem::getItemName , Fooditem::getType));
	
	resultmap.forEach( (k,v) -> System.out.println (k + " : " + v ));
	
	
	  }
}
