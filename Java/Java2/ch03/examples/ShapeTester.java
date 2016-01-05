package examples;

public class ShapeTester
{
	public static void main(String[] args)
	{
		Shape [] test1  = new Shape [3];
		
		Rectangle R1 = new Rectangle(5,5,Color.GREEN,15,10);
		
		Rectangle R2 = new Rectangle(15,30);
		
		Text t1 = new Text("Hello");
		
		Circle C1 = new Circle(5);
		
		//Shape [] test1  = new Shape {R1,R2,C1};
		test1[0] = R1;
		test1[1] = R2;
		test1[2] = C1;
		
		Drawable [] e = new Drawable[4];
		e[0] = R1;
		e[1] = R2;
		e[2] = C1;
		e[3] = t1;
		
		for(Drawable D: e)
		{
			//System.out.println("  " + D);
			D.drawable();
		}
		
		
		
		for(Shape S: test1)
		{
			System.out.println(S.getArea());
		}
		
	}
}
