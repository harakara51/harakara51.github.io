package testDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Stringtest
{
	
	String test1 = "Create ";
	String b = "a Calculator class";

	@Test
	public void testcharAt()
	{
		assertEquals('C', test1.charAt(0));
	}
	@Test
	public void testconcat()
	{
		assertEquals("Create a Calculator class", test1 + b);
	}
	
	@Test
	public void testcontains()
	{
		assertTrue(b.contains("class"));
	}
	
	@Test
	public void testendsWith()
	{
		assertTrue(b.endsWith("class"));
	}
	
	@Test
	public void testindexOf()
	{
		assertEquals(2, b.indexOf("Calculator"));
	}
	
	@Test
	public void testLastIndexOf()
	{
		assertEquals(2, b.lastIndexOf("Calculator"));
	}
	
	@Test
	public void testIsEmpty()
	{
		assertFalse(b.isEmpty());
	}
	
	@Test
	public void testLength()
	{
		assertEquals(7, test1.length());
	}
	
	@Test
	public void testreplaceLength()
	{
		assertEquals("Croato ", test1.replace("e", "o"));
	}
	
	@Test
	public void testsplit()
	{
		String c = "James , David , John";
		String [] test3 = {"James ", " David "," John"};	
		assertEquals(test3, c.split(","));
	} 

}
