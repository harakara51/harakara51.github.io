
public class Jets
{
	private String name;
	private int speed;
	private int range;
	private int capacity;
	private int price;
	private pilot pilot;
	
	
	public Jets ()
	{
		
		
		this(100,1000,500,10000000,"test");
		
		
	}
	
	public Jets(int speed, int range, int capacity, int price, String name)
	{
	
		this.speed = speed;
		this.range = range;
		this.capacity = capacity;
		this.price = price;
	
	}


	/**
	 * @return the speed
	 */
	public int getSpeed()
	{
		return speed;
	}


	/**
	 * @return the range
	 */
	public int getRange()
	{
		return range;
	}


	/**
	 * @return the capacity
	 */
	public int getCapacity()
	{
		return capacity;
	}


	/**
	 * @return the price
	 */
	public int getPrice()
	{
		return price;
	}


	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}


	/**
	 * @param range the range to set
	 */
	public void setRange(int range)
	{
		this.range = range;
	}


	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(int price)
	{
		this.price = price;
	}


	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}


	/**
	 * @return the pilot
	 */
	public pilot getPilot()
	{
		return pilot;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}


	/**
	 * @param pilot the pilot to set
	 */
	public void setPilot(pilot pilot)
	{
		this.pilot = pilot;
	}
	
	
	public void display()
	{
		System.out.println("Name: \t " + name  + " speed: " + speed + " range: " + range + " passenger capacity: " + capacity
				+ " price: " + price);
	}
	

}
