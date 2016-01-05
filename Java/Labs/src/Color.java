
public class Color
{
	// fields

	private int red;
	private int green;
	private int blue;
	private String color;
	

	// Methods
	public Color (int r, int g, int b)
	{
		int red = r;
		int green = g;
		int blue = b;
		
	}
	public int getRed()
	{
		return red;
	}
	public int getGreen()
	{
		return green;
	}
	public int getBlue()
	{
		return blue;
	}
	public String getColor()
	{
		return color;
	}
	public void setRed(int red)
	{
		this.red = red;
	}
	public void setGreen(int green)
	{
		this.green = green;
	}
	public void setBlue(int blue)
	{
		this.blue = blue;
	}
	public void setColor(String color)
	{
		this.color = color;
	}


	public void display() {
		System.out.println("Red ratio: " + red);
		System.out.println("Green ratio: " + green);
		System.out.println("Blue ratio: " + blue);
		System.out.println("Color name:  " + color);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + ", color=" + color + "]";
	}

	

}
