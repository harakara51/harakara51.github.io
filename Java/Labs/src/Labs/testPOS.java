package Labs;

import java.util.Scanner;

public class testPOS
{
	
	public static double cost;
	public static double change;
	public static double customerInput;


	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		startRegister(keyboard);
		keyboard.close();

	}

	public static void startRegister(Scanner keyboard)
	{
		System.out.println("How much is the total cost of the day");
		cost = keyboard.nextDouble();
		System.out.println("How much do want to pay");
		customerInput = keyboard.nextDouble();

	}

}