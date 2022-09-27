package com.stackroute.sampleautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Hotel {

	
	String hotelName;
	String addr;
	
	
		
		Item item;
		
		
		@Autowired
		public Hotel(Item item)
		{
			this.item = item;
		}
		
		
	
		public Hotel(String hotelName, String addr, Item item) {
			super();
			this.hotelName = hotelName;
			this.addr = addr;
			this.item = item;
		}
		public String getHotelName() {
			return hotelName;
		}
		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public Item getItem() {
			return item;
		}
		public void setItem(Item item) {
			this.item = item;
		}


		@Override
		public String toString() {
			return "Hotel [hotelName=" + hotelName + ", addr=" + addr + ", item=" + item + "]";
		}

}
