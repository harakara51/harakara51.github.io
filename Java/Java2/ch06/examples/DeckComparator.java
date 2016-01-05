package examples;

import java.util.Comparator;

public class DeckComparator implements Comparator<Card>
{
	public int compare(Card a, Card b)
	{
	return (a.getRank().compareTo(b.getRank()));
	
	}

}
