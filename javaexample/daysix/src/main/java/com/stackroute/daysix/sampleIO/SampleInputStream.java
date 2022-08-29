package com.stackroute.daysix.sampleIO;

import java.io.FileInputStream;
import java.io.InputStream;

public class SampleInputStream {

	public static void main(String[] args) {
		
		
		InputStream inputobj=null;
		byte[] data=new byte[300];
		try
		{
			inputobj=new FileInputStream("hello.txt"); //relative path
			inputobj.read(data);
			String datastr=new String(data);
			System.out.println(datastr);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e.getMessage());
		}
	}

}
