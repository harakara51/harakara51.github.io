package testDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest
{
	
	Calculator test1 = new Calculator();

	@Test
	public void testAddIntInt()
	{
		assertEquals(100, test1.add(50, 50),.1);
	}

	@Test
	public void testAddDoubleDouble()
	{
		assertEquals(100.4, test1.add(50.3, 50.1),.1);
	}

	@Test
	public void testSubtractIntInt()
	{
		assertEquals(25, test1.subtract(100, 75),.1);
	}

	@Test
	public void testSubtractDoubleDouble()
	{
		assertEquals(25.3, test1.subtract(100.4, 75.1),.1);
	}

	@Test
	public void testMultiplyIntInt()
	{
		assertEquals(100, test1.multiply(10, 10),.1);
	}

	@Test
	public void testMultiplyDoubleDouble()
	{
		assertEquals(100.0, test1.multiply(10.0, 10.0),.1);
	}

	@Test
	public void testDivideIntInt()
	{
		assertEquals(10.0, test1.divide(100, 10),.1);
	}

	@Test
	public void testDivideDoubleDouble()
	{
		assertEquals(10.0, test1.divide(100.0, 10.0),.1);
	}

//	@Test
//	public void testGetNumber1()
//	{
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetNumber2()
//	{
//		fail("Not yet implemented");
//	}

}
