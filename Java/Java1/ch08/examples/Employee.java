package examples;

public class Employee
{
	private String firstName;
	private String lastName;
	private String title;
	private int salary;
	private int employyId;
	private String emailAddress; 

	// Method
	public Employee()
	{
		this ("J","Doe", "JDoe@gmail.com", 0);
	}
	
	public Employee(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;		
	}
	
	public Employee(String fN, String lN, String email, int Sal)
	{
		firstName = fN;
		lastName = lN;
		salary = Sal;
		emailAddress = email;
		
	}

	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getTitle()
	{
		return title;
	}
	public int getSalary()
	{
		return salary;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public void setEmailAddress(String email)
	{
		this.emailAddress = email;
	}
	
	
	public void salary()
	{
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Salary    : " + salary);
	}
	public void display ()
	{
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Salary    : " + salary);
		System.out.println("Email : " + emailAddress);
		System.out.println("Title    : " + title);
		
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", title=" + title + ", salary=" + salary
				+ ", employyId=" + employyId + ", emailAddress=" + emailAddress + "]";
	}


}
