package com.stackroute.daytwo;

public class College {

		String collegeName;
		String location;
		int strength;
		
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String loca) {
			
			if (loca.isBlank() || loca.isEmpty() || loca==null )
				location="Delhi";
			else
			    this.location = loca;
		}
		public int getStrength() {
			return strength;
		}
		public void setStrength(int strength) {
			if (strength<0)
				this.strength=0;
			else
				this.strength = strength;
		}
		
		public String toString()
		{
			return " College name : " + collegeName + " Location : " + location + " Strength : " + strength ;
		}
	
}
