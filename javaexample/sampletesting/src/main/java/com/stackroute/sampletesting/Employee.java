package com.stackroute.sampletesting;

public class Employee {
	String eid;
	String ename;
	int age;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String changeName()
	{
		return ename.toUpperCase();
	}
	
	public boolean checkAge() {
		if (age>20)
			return true;
		else
			return false;
	}

}
