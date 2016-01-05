package testDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest
{

	@Test
	public void testGetName()
	{
		Person p = new Person("Jamie", "Romero");
		assertEquals("Jamie Romero", p.getName());
	}

}
