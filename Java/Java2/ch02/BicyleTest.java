import static org.junit.Assert.*;

import org.junit.Test;

public class BicyleTest
{
	Bicyle b1 = new Bicyle(30,10);

	@Test
	public void testGetNumGears()
	{
		assertEquals(10, b1.getNumGears());
	}

	@Test
	public void testGetMaxSpeed()
	{
		assertEquals(30, b1.getMaxSpeed());
	}

	@Test
	public void testGetNumWheels()
	{
		assertEquals(2, b1.getNumWheels());
	}


}
