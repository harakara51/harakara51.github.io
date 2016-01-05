package examples;

public class Circle extends Shape
{
	private int radius;
	private double area;
	
	

	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}
	
	public Circle (int x, int y, Color c, int radius)
	{
		super(x, y, c);
		this.radius = radius;
	}

	public void drawable ()
	{
		System.out.println(" Shape is at " + super.getGetX()  + super.getGetY() +super.getColor());
	}
	
	@Override
	public double getArea()
	{
		return  Math.pow(radius, 2) * (Math.PI);
	}

	



	/**
	 * @return the radius
	 */
	public int getRadius()
	{
		return radius;
	}




	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius)
	{
		this.radius = radius;
	}




	/**
	 * @param area the area to set
	 */
	public void setArea(double area)
	{
		this.area = area;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}

	



}
