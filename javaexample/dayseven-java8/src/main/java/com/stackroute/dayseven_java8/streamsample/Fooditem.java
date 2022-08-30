package com.stackroute.dayseven_java8.streamsample;
class Address
{
	String street;
	String pincode;
}
public class Fooditem {

	String itemName;
	int price;
	int qty;
	String type;
	Address addr;

	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public Fooditem(String itemName, int price, int qty, String type) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
		this.type = type;
	 
	}
	public Fooditem(String itemName, int price, int qty, String type,Address addr) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
		this.type = type;
		this.addr=addr;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Fooditem [itemName=" + itemName + ", price=" + price + ", qty=" + qty + ", type=" + type + "]";
	}
}
