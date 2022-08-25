package com.stackroute.dayfour;

public class RailwayProcess {

	public static void main(String[] args) {
		
	//Dynamic poly. Virtual Method invocation
		
		//Person person=new Person(); not possible , since person is a absract class

 
     Person	person1=new Employee(); // possible , since passenger is a child class of person
	 new RailwayProcess().printDetail(person1);
	}
	
	public void printDetail(Person person)
	{
		
		 person.setName("mary");
		 person.display();
		 
		 if(person instanceof Employee)
		 {
			 Employee emp=(Employee)person; // class casting
			 emp.setBonus();
		 }
		 
		 else if (person instanceof Passenger)
		 {
			 Passenger pass=(Passenger)person;
			 pass.covidRule();
		 }
		 
	}

}




//Passenger passenger1=new Passenger();
//passenger1.setName("Manish");
//passenger1.setAge(20);
//
////	passenger1.display();
//
//Employee employee1=new Employee();
//employee1.setName("Peter");
//employee1.setAge(50);

//	employee1.display();
	



//person1.setName("Elyas");
//person1.display();


//person1.setBonus();


//person1.setBonus();
 
//person1=new Passenger();
//person1.display();

//
//Person person2=new Passenger();
//person2.setName("Kavitha");
//person2.display();
