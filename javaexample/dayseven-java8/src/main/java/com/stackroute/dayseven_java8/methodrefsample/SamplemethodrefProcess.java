package com.stackroute.dayseven_java8.methodrefsample;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface iFormat
{
	String display(String data);
}

interface iData
{
	void getData(String info);
}

interface iCheck
{
	  void printAll(int num);
}
public class SamplemethodrefProcess {

	public static void main(String[] args) {
		
		// method ref. as display method and changeStyle are having same method signature, 
		//we are using definition of changestyle for display
		
		iFormat formatobj= new Person() :: changeStyle;
		String ans=formatobj.display("hello");
		//System.out.println(ans);
		
		iData dataobj= new Person() :: setName;
		
		
		iCheck checkobj= Person  :: showAll;
    	checkobj.printAll(10);
    	
    	List<String> datalist=Arrays.asList("mouse","keyboard","headset","cooler");
    	
    	//consumer , accept method signature one param, no return value 
    	// mapped with method reference of System.out class println method
    	
    	datalist.forEach( System.out :: println);
    	
	}

}
