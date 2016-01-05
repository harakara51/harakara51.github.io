package testDemo;

public class Person
{
	private String firstName;
	private String lastName;
	
	//Constructor
	public Person(String firstName, String lastName)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName()
	{
		return firstName + " "+ lastName;
	}
	
	
}
