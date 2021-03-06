package examples;

public abstract class Shape implements Drawable
{
	private int getX;
	private int getY;
	private Color color;
	
	public Shape()
	{
	
		this (0,0,Color.YELLOW);
	}
	
	public Shape(int getX, int getY, Color color)
	{
	
		this.getX = getX;
		this.getY = getY;
		this.color = color;
	}

	
//methods
	
	public abstract double getArea ();
	
	/**
	 * @return the getX
	 */
	public int getGetX()
	{
		return getX;
	}

	/**
	 * @return the getY
	 */
	public int getGetY()
	{
		return getY;
	}

	/**
	 * @param getX the getX to set
	 */
	public void setGetX(int getX)
	{
		this.getX = getX;
	}

	/**
	 * @param getY the getY to set
	 */
	public void setGetY(int getY)
	{
		this.getY = getY;
	}
	
	
	public Color  getColor()
	{
		return color;
	}
	
	public void setColor (Color color)
	{
		this.color = color;
	}

	
	
 
	
}
