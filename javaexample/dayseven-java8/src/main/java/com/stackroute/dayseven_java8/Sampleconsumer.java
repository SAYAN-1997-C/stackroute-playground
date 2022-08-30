package com.stackroute.dayseven_java8;

import java.util.function.Consumer;

public class Sampleconsumer {

	public static void main(String[] args) {
		
		
		Consumer<String> consobj = (str) -> {
												if (str.startsWith("A"))
														System.out.println( " starting with A ");
											 
												else
													System.out.println(" Does not start with A ");
											};
											
		
							consobj.accept("Apple");
											
							consobj.accept("Banana");
	
							
		
	}

}
