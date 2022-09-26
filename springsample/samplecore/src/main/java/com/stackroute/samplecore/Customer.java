package com.stackroute.samplecore;

public class Customer {
	
	
	String name;
	String addr;
	int age;
	
	Customer()
	{
		
	}
	
	Customer(String nm,String addr, int age)
	{
		this.name=nm;
		this.addr=addr;
		this.age=age;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
