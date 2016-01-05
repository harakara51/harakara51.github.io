package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Deck
{
	public static void main(String[] args)
	{
		Set<Card> deck = new TreeSet<Card>();

		for (Suit s : Suit.values())
		{
			for (Rank r : Rank.values())
			{
				deck.add(new Card(r, s));
			}
		}
		// deck.sort(DeckComparator);
		
		//Collections.shuffle(deck);
		
		
		for (Card card : deck)
		{
			System.out.println(card);

		}
		
//		Collections.shuffle(deck);
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */


}