package com.stackroute.samplejavameta;

public class Item {

	  @Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + "]";
	}
	String itemName;
	  int price;
	  
	  public Item()
	  {
		  
	  }
	public Item(String itemName, int price) {
		super();
		this.itemName = itemName;
		this.price = price;
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
	  
	  
	
}
