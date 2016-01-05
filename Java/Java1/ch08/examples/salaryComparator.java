package examples;

import java.util.Collection;
import java.util.Comparator;

public class salaryComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2)
	{
		if (o2.getSalary() < o1.getSalary())
		{
			return 1;
		} else
		{
			return -1;
		}
	}

	
}

