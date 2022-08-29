package com.stackroute.daysix.sampleIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SampleWriterStream {

	public static void main(String[] args) {
	 FileWriter fileobj=null;
	 try
	 {
		 
		 fileobj=new FileWriter("notes.txt",true);
		 BufferedWriter bwrite=new BufferedWriter(fileobj);
		 int choice;
		 do
		 {
			 System.out.println("Enter somethig");
			 Scanner scan=new Scanner (System.in);
			 String info=scan.nextLine();
			  bwrite.write(info);
			 System.out.println("Want to continue 1-yes 2-no");
			  choice=scan.nextInt();
		 } while(choice==1);
		 
		 bwrite.flush();
		 
		System.out.println("File created"); 
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
		
	}

}
