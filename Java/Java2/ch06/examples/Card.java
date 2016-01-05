package examples;
import java.util.Comparator;

public class Card implements Comparable<Card>{
    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s) {
        rank = r;
        suit = s;
    }

    @Override
    public String toString() {
        return (rank + " of " + suit).toLowerCase();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result
                + ((suit == null) ? 0 : suit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Card other = (Card) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
    }

	/**
	 * @return the rank
	 */
	public Rank getRank()
	{
		return rank;
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit()
	{
		return suit;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(Rank rank)
	{
		this.rank = rank;
	}

	/**
	 * @param suit the suit to set
	 */
	public void setSuit(Suit suit)
	{
		this.suit = suit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Card o)
	
	{
		
		int num1 =this.rank.compareTo(o.rank);
		int num2 =this.suit.compareTo(o.suit);
		
            if (num1 ==0)
            	return num2;
            else 
            	return num1;
	}
    
    
}
