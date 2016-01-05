
public class Bicyle extends Vehicle
{

	private int numGears;

	
	//constructors
	public Bicyle()
	{	
		this(25, 10);
	}
	
	public Bicyle(int maxSpeed, int numGears)
	{   
		
		super(maxSpeed, 2);
		this.numGears = numGears;
	}


	/**
	 * @return the numGears
	 */
	public int getNumGears()
	{
		return numGears;
	}


	/**
	 * @param numGears the numGears to set
	 */
	public void setNumGears(int numGears)
	{
		this.numGears = numGears;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}
	
	
	
	
	
}
