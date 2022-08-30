package com.stackroute.dayseven_java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class SamplePredicate {

	public static void main(String[] args) {
		 
		Predicate<String> preobj= (day)-> day.equals("Tuesday");
		
		
		System.out.println( preobj.test("Tuesday") );
		
		Predicate<Integer>  preeven = (num) -> num.intValue() %2 ==0;
		
 		Scanner scan=new Scanner(System.in);
 		int number=scan.nextInt();
		
		if (preeven.test(number))
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		
	}

}
