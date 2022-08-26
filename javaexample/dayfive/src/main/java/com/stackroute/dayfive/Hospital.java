package com.stackroute.dayfive;

public  class Hospital {

	static String name;
	final int year=1990;
	
	 final static void display()
	{
		System.out.println("name " + name );
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}

	
	
}
