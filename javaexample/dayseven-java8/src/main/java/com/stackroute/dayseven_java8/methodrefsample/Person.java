package com.stackroute.dayseven_java8.methodrefsample;

public class Person {
		
			String name;
			int age;
			
			public Person()
			{
				
			}
			public Person(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			// method signature :  1 String argument , 1 string return type
			public String changeStyle(String name)
			{
				if (name==null || name.isBlank() || name.isEmpty())
					return "invalid";
			
				return name.toUpperCase();
			}
			
			public static void showAll(int n)
			{
				System.out.println("**************");
			}
	
}
