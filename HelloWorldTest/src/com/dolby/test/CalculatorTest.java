package com.dolby.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dolby.gocd.Calculator;

public class CalculatorTest
{
	Calculator cal;
	
	@Before
	public void setUp() throws Exception 
	{
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsLeapYear() 
	{
		int year = 2012;
		assertTrue(String.format("When pass %d to isLeapYear, it should return true", year), cal.isLeapYear(year));
	}
	
	@Test
	public void testAdd()
	{
		int expected = 3;
		assertEquals(expected, cal.add(1, 2));
	}
	
	@Test
	public void testConcatString()
	{
		String expected = "Hello World";
		assertEquals(expected, cal.concatString("Hello", "World"));
	}
}
