package com.stackroute.hospitalcore;

public class Hospital {
	
	String hname;
	@Override
	public String toString() {
		return "Hospital [hname=" + hname + ", years=" + years + "]";
	}
	int years;
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	

}
