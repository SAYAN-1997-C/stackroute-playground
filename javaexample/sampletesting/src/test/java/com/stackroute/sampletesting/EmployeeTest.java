package com.stackroute.sampletesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	Employee emp;
	
	@Before
	public void dataintialize()
	{
		emp=new Employee();
		emp.setEname("rahul");
		emp.setAge(34);
		emp.setEid("e10");
	}
	
	
	
	@Test
	public void testEnameSuccess()
	{
		assertEquals("rahul",emp.getEname());
	}
	
	
	@Test
	public void testAge()
	{
		assertEquals(34,emp.getAge());
	}
	
	@Test
	public void testidnotnull()
	{
		assertNotNull(emp.getEid());
	}

}
