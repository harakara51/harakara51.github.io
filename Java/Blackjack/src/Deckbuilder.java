import java.util.ArrayList;
import java.util.Random;

public class Deckbuilder
{
	private CardsGUI Cards;

	private ArrayList<CardsGUI> Deck;

	
	
	
	public Deckbuilder()
	{
			setDeck();
	}

	/**
	 * @return the cards
	 */
	public CardsGUI getCards()
	{
		return Cards;
	}
	
	public CardsGUI getRandomCard()
	{
		Random rand = new Random();

		int random = rand.nextInt((36 - 1) + 1);
		return Deck.get(random);
	}

	/**
	 * @return the deck
	 */
	public ArrayList<CardsGUI> getDeck()
	{
		return Deck;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(CardsGUI cards)
	{
		Cards = cards;
	}

	/**
	 * @param deck
	 *            the deck to set
	 */
	public void setDeck()
	{
		Deck = new ArrayList<>();
		String[] suit =
			{ "Hearts", "Diamonds", "Spades", "Clubs" };
			int[] number =
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

			for (int i = 0; i < suit.length - 1; i++)
			{
				for (int k = 0; k < number.length; k++)
				{
					int Value;

					int Number = number[k];
					String Suit = suit[i];
					String Name = suit[i] + " " + String.valueOf(Number);
					String Path = "Images/" + Name + ".png";
					if (k < 10)
					{
						Value = number[k];
					} else
						Value = 10;

					CardsGUI Card = new CardsGUI(Number, Suit, Name, Path, Value);
					Deck.add(Card);
				}
			}

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Deckbuilder [Cards=" + Cards + ", Deck=" + Deck.get(0).getName() + " " + Deck.get(0).getPath();
	}
	
	
	

}
