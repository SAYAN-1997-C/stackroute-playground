package com.stackroute.sampletestnewapi;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
 

public class EmployeeTest {
Employee emp;
	
	@BeforeEach
	public void initialize()
	{
		emp=new Employee();
		emp.setEid("E102");
		emp.setEname("Varun");
		emp.setAge(25);
		
	}
	
	@Test
	public void testnameformat()
	{
		assertEquals("VARUN",emp.changeName());
	}
	
	@Test
	public void testagesuccess() throws InvalidAgeException
	{
		
		assertTrue(emp.checkAge());
	}
	
	@Test
	public void testagefailure() throws InvalidAgeException
	{
		emp.setAge(13);
		Exception excep=assertThrows(InvalidAgeException.class, ()-> emp.checkAge());
		assertEquals("Age should be greater than 20", excep.getMessage());
	}
	
	
	@Test
	public void whenchangenamethenretunvalue()
	{
	String result=	assertTimeout(Duration.ofSeconds(1), ()->
		 				{
		 					String ans=emp.changeName();
		 					return ans;
		 				});
	
	assertEquals("VARUN",result);
	}
	
	@Test
	public void whendatavalidthenreturnsuccess()
	{
		emp.setAge(12);
		assertAll("valid name and age" , ()->
		{
			assertNotNull(emp.getEid());
			assertEquals("Varun",emp.getEname());
			 assertAll( "check age",()->{
				  assertTrue(emp.checkAge());
			 });
		});
	}
	
}
