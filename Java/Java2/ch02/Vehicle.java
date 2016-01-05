
public class Vehicle
{

	private int maxSpeed;
	private int numWheels;
	
	
	//constructors
	public Vehicle()
	{
		this(90, 4);
		
	}
	
	public Vehicle(int maxSpeed, int numWheels)
	{
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
	}
	
	
	//method
	
	
	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	/**
	 * @return the numWheels
	 */
	public int getNumWheels()
	{
		return numWheels;
	}
	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	/**
	 * @param numWheels the numWheels to set
	 */
	public void setNumWheels(int numWheels)
	{
		this.numWheels = numWheels;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Vehicle [maxSpeed=" + maxSpeed + ", numWheels=" + numWheels + "]";
	}
	
	
	
	
}
