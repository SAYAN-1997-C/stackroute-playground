package com.stackroute.java8samples;

@FunctionalInterface
interface iStudent
{
	
	//method signature : 2 inputs, both floats , no return 
	   void findPercent(float mark,float total);
	   
	   

	   
	   default void details()
	   {
		   System.out.println("University Amirta");
	   }
}



@FunctionalInterface
interface iBook
{
	
	void displayPrice(String type);
	
}

public class SampleLambda {

	public static void main(String[] args) {
		
		//implementing abstract method using lambda
		
		iStudent studentobj=(mk,tot)->{
											float avg=mk/tot*100;
											System.out.println("PErcentage is   "+ avg);
										};
		
				
		studentobj.findPercent(500, 600);
		
		iBook bookobj= (booktype)->{
										if (booktype.equals("Fiction"))
											System.out.println("Book cost is only Above Rs.500");
										else
											
											System.out.println("You can find books cost Below Rs.500");
			
									};
		
								bookobj.displayPrice("Story");
		
	}

}
