
public class CardsGUI
{
private int number;
private String suit;
private String name;
private String  path;
private int value;

public CardsGUI()
{
	setNumber();
	setSuit();
}

public CardsGUI(int number, String suit)
{
	
	this.number = number;
	this.suit = suit;
}

public CardsGUI(int number, String suit, String name)
{
	
	this.number = number;
	this.suit = suit;
}

public CardsGUI(int number, String suit, String name, String path)
{
	
	this.number = number;
	this.suit = suit;
	this.path = path;
}
public CardsGUI(int number, String suit, String name, String path, int value)
{
	
	this.number = number;
	this.suit = suit;
	this.name = name;
	this.path = path;
	this.value = value;
}

/**
 * @return the number
 */
public int getNumber()
{
	return number;
}
/**
 * @return the suit
 */
public String getSuit()
{
	return suit;
}
/**
 * @param number the number to set
 */
public void setNumber()
{
	int [] number = {1,2,3,4,5,6,7,8,9,10,11,12};
	this.number = number[(int)((Math.random() * 12))];
}
/**
 * @param suit the suit to set
 */
public void setSuit()
{
	String [] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
	this.suit = suit[(int)((Math.random() * 4))];
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString()
{
	return "Cards [number=" + number + ", suit=" + suit + "]";
}

/**
 * @return the name
 */
public String getName()
{
	
	return name;
}

/**
 * @return the cardImage
 */
public String getPath()
{
	return path;
}

/**
 * @return the value
 */
public int getValue()
{
	return value;
}

/**
 * @param name the name to set
 */
public void setName(String name)
{
	this.name = name;
}

/**
 * @param cardImage the cardImage to set
 */
public void setCardImage(String path)
{
	this.path = path;
}

/**
 * @param value the value to set
 */
public void setValue(int value)
{
	this.value = value;
}








}
