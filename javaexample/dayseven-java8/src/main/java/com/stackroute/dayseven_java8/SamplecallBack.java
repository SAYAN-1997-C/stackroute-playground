package com.stackroute.dayseven_java8;


interface iBilling
{
	//declaring abstract function
	int setPrice(String itemname);
	
}
public class SamplecallBack {

	
	
	public static void main(String[] args) {
	
		//implementing function
	iBilling billingobj=(name)-> {
								if(name.startsWith("Food"))
									return 100;
								else if (name.equals("Stationary"))
									return 50;
								else
									return -1;
						};
						
	//calling printbill method. eg of Callback Functionality, method is having argument as another interface	
		printBill("Fooditem" ,billingobj );
		 
	}
	
	static void printBill(String item,iBilling bill)
	{
		//calling function
	int price=	bill.setPrice(item);
	System.out.println("Prnting bill for " + item + " price is " + price);
	}

}
