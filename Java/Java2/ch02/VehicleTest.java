
public class VehicleTest
{

	
	public static void main(String[] args)
	{
		
		
		Bicyle b1 = new Bicyle(30, 10);
		
		Bicyle b2 = new Bicyle(15, 3);

		Vehicle v1 = new Vehicle(250, 4);
	
		Vehicle [] test = {b1, b2, v1};
		
		
		for(Vehicle V: test)
		{
			System.out.println(V);
		}
//		for( int i =0; i < 3; i++)
//		{
//			System.out.println(test[i]);
//		}
	}
}
