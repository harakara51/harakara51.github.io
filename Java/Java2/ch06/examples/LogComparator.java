package examples;

import java.util.Comparator;

 class LogComparator implements Comparator <Log>
{
	public int compare(Log a, Log b)
	{
	return (a.getVisits().compareTo(b.getVisits()));
	
	}

}
