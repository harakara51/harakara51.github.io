package examples;

public class Employee5 {
    public static int retirementAge = 72;
    public static float minimumWage = 6.75F;

    private String firstName;
    private String lastName;
    private Title title;
    private float salary;
    private int id;

    // constructors
    public Employee5(String fname, String lname, Title tit) {
        firstName = fname;
        lastName = lname;
        title = tit;
    }

    public Employee5() {
        this("J.", "Doe", Title.CLERK);
    }

    public void showEmp() {
        System.out.println("Employee " + "(Min Wage: " + minimumWage
                + ", Ret Age: " + retirementAge + "):");

        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }

    // gets and sets
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float s) {
        salary = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Employee5 [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", id=" + id
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee5 other = (Employee5) obj;
		if (firstName == null)
		{
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null)
		{
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}

	/**
	 * @return the title
	 */
	public Title getTitle()
	{
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(Title title)
	{
		this.title = title;
	}


}
