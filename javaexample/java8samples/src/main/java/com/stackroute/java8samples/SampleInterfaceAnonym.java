package com.stackroute.java8samples;

interface iCalculate
{
	void findAverage(int a, int b);
	
	String findBig(int a,int b);
}



public class SampleInterfaceAnonym {

	public static void main(String[] args) {

		
		iCalculate calcuobj=new iCalculate()
								{

									public void findAverage(int a, int b) {
									 System.out.println("Average is " + (a+b)/2);
										
									}

									public String findBig(int a, int b) {
									    if(a>b)
										return "Bigger number is " + a;
									    else
									    	return "Bigger number is " + b;
									    	
									}
									
								};
							
					calcuobj.findAverage(100, 30);
			String result=calcuobj.findBig(20, 35);
			System.out.println("Result is " + result);
			
			
			iCalculate calcobj2=new iCalculate()
									{

										public void findAverage(int a, int b) {
										
											System.out.println( "Ans is " + (a+b)/2 + "%"); 
											
										}

										public String findBig(int a, int b) {
  
											if (a>b && a>100)
											return "Big is " + a;
											else if (b>a && b>100 )
											return	"Big is " +b;
											else
												return "Invalid number";
										}	 
					
									};
									
		System.out.println(calcobj2.findBig(30,60));
									
				

	}

}
