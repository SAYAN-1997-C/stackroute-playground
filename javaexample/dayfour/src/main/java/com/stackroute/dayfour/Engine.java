package com.stackroute.dayfour;

public abstract class Engine {
	
	String company;
	int warranty;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	public abstract void setPolicy();
	
	void showDetails()
	{
		System.out.println("company " + company);
	}
	

}
