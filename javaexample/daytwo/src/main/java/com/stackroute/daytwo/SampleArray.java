package com.stackroute.daytwo;

import java.util.Scanner;

public class SampleArray {

	public static void main(String[] args)
	{

		String name[];
		
		name=new String[3];
		
		name=new String[5];
		
		  Scanner scan=new Scanner(System.in);
		int rank[]=new int[3];
		
		
		int[] score=new int[3];
		
		int total=0;
		/*
		for (int i=0;i<=2;i++)
		{
			
		System.out.println("enter rank and score and name ");
		rank[i]=scan.nextInt();
		score[i]=scan.nextInt();
		scan.nextLine();
		name[i]=scan.nextLine();

			total+=score[i];
			
		}
		*/
		
		for (int i=0;i<=2;i++)
		{
		
			//System.out.println("name " + name[i] + " rank " + rank[i] );
		
		}
		
		System.out.println("Average score of the school " + (total/3) );
		
		//non rectangular array
		
		int data[][]=new int[3][];
		
		data[0]=new int[2];
		data[1]=new int[4];
		data[2]=new int[3];
		
			for(int i=0;i<=2;i++)
			{
				  for(int j=0;j<data[i].length;j++)
				  {
					  
				  }
				
			}
			
			
			String source[]= {"Milk","Sweet","Ghee"};
			
			String destin[]= {"Coffee","Tea","Snacks","abc","def","efg"};
			
			
			System.arraycopy(source, 0, destin, 3,2);
			
			for(int i=0;i<destin.length;i++)
			System.out.println(destin[i]);
			
		
		
	} // main
	
	

	
	
	

	
	
	


}
