package com.stackroute.samplejavameta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stackroute.samplejavameta.Hotel;
import com.stackroute.samplejavameta.Item;

@Configuration
public class ItemConfig {

	@Bean("itembean")
	public Item createItem()
	{
		
		Item itemobj=new Item("Cake",40);
		return itemobj;
	}
	
	
	@Bean("hotelbean")
	public Hotel createHotel()
	{
			
		Hotel hotelobj=new Hotel();
		hotelobj.setHotelName("Tasty hotel");
		hotelobj.setAddr("Blore");
		return hotelobj;
	}
	
}
