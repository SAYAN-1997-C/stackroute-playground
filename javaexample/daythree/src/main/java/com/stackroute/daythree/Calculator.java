package com.stackroute.daythree;

public class Calculator {

	//polymorphism . method Overload
	
	void add(int a, int b)
   {
	   System.out.println(a+b);
	   
   }
   
   void add(int a, float b)
   {
	   System.out.println(a+b);

   }
   
   void add(float a,float b)
   {
	   System.out.println(a+b);

   }
   
   void add (String a,int b)
   {
	   System.out.println(a+b);

   }
   
   void add(int a,String b)
   {
	   System.out.println(a+b);

   }
   
   void add(String a,String b)
   {
	   System.out.println(a+b);

   }
}
