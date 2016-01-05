import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

	public static ArrayList<Jets> Jets = new ArrayList<Jets>();
	public static int userChoice;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		makeFleet();
		
		while (true)
		{
			menu(keyboard);
			if (userChoice == 1)
			{
				for (int i = 0; i < Jets.size(); i++)
				{

					Jets.get(i).display();
	
				}

			} else if (userChoice == 2)
			{
				int fastest = 0;
				for (int i = 0; i < Jets.size(); i++)
				{	
					if (Jets.get(i).getSpeed() > fastest)
						fastest = Jets.get(i).getSpeed();
					System.out.println(Jets.get(i).getSpeed());
					
				}
				System.out.println(fastest);
			} else if (userChoice == 3)
			{
				int range = 0;
				
				for (int i = 0; i < Jets.size(); i++)
				{	
					if (Jets.get(i).getRange()> range )
					{	
						System.out.println("True");
						range = Jets.get(i).getRange();
					}
					System.out.println(Jets.get(i).getRange());
				}
				System.out.println(range);
			} else if (userChoice == 4)
			{
				newJet(keyboard);
			} else if (userChoice == 5)
			{
				// hirePilot(keyboard);
			} else if (userChoice == 6)
			{
				break;
			}

		}
		keyboard.close();
	}

	public static void menu(Scanner keyboard)

	{
		System.out.println("\t \t 1) List Fleet \t \t");
		System.out.println(" ");
		System.out.println("\t \t 2 )View Fastest Jets  \t \t  ");
		System.out.println(" ");
		System.out.println("\t \t 3) View jet with longest range  \t \t ");
		System.out.println(" ");
		System.out.println("\t \t 4) Buy customised jet  \t \t ");
		System.out.println(" ");
		System.out.println("\t \t 5) Hire pilots  \t \t ");
		System.out.println(" ");
		System.out.println("\t \t 6) Quit Menu  \t \t ");
		userChoice = keyboard.nextInt();
	}

	public static void hirePilots(Scanner keyboard)
	{
		String name = " ";
		int experience = 0;
		boolean isVeteran =false;
		

		System.out.println("Please enter the name of the pilot :");
		name = keyboard.next();

		System.out.println("Enter how many year of experience the pilot has:");
		experience= keyboard.nextInt();
		if (experience < 3)
			System.out.println(" The pilot fails to meet our minimum experience requirement, he cannot be hired");

		System.out.println("Is the pilot from the airforce?");
		isVeteran= keyboard.nextBoolean();
		if(!isVeteran)
			System.out.println(" All pilots has to be from the Air force ");

		if (experience >3 && isVeteran)
		{
			pilot test = new pilot (name, experience, isVeteran);
			
		}
	}

	public static void makeFleet()
	{
		Jets T1 = new Jets();
		Jets B737C1 = new Jets(560, 3600, 189, 65000000, "B737");
		Jets B747C1 = new Jets(570, 8300, 580, 357000000, "B747");
		Jets B747C2 = new Jets(570, 8300, 580, 357000000, "B747");
		Jets B777C1 = new Jets(570, 11000, 451, 286000000, "B777");
		Jets B777C2 = new Jets(590, 12000, 451, 296000000, "B777");
		Jets.add(T1);
		Jets.add(B737C1);
		Jets.add(B747C2);
		
		
		Jets.add(B747C1);
		Jets.add(B777C1);
		Jets.add(B777C2);
		
		Jets

	}

	public static void newJet(Scanner keyboard)
	{
		String model = " ";
		int speed, range, capacity, price = 0;

		System.out.println("Please enter the model number of the jet :");
		model = keyboard.next();

		System.out.println("Please enter the max speed of the jet:");
		speed = keyboard.nextInt();

		System.out.println("Please enter the max capacity of the jet:");
		capacity = keyboard.nextInt();

		System.out.println("Please enter the max range of the jet:");
		range = keyboard.nextInt();

		System.out.println("Enter the price of the jet:");
		price = keyboard.nextInt();

		Jets.add(new Jets(speed, range, capacity, price, model));

	}
}
