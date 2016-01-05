package examples;

import java.util.Scanner;

public class TestEmployeeMenu
{
	public static int managerChoice = 0;
	public static String[] employees = new String[10];

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		startMenu(keyboard);
		keyboard.close();
	}// end main

	public static int userChoice(int choice)
	{

		managerChoice = choice;
		return choice;
	}

	public static void startMenu(Scanner keyboard)
	{
		while (true)
		{
			System.out.println("1: List employees.");
			System.out.println("2: Hire employee.");
			System.out.println("3: Fire employee");
			System.out.println("4: Quit program.");
			System.out.println("Please choose 1-4");
			managerChoice = keyboard.nextInt();
			userChoice(managerChoice);
			if (managerChoice == 4)
			{
				break;
			} 
//			else if (managerChoice == 1)
//			{
//				listEmployees();
//			}
//
			else if (managerChoice == 2)
			{
				newHire(keyboard);
			}
		} // end loop
	}// end startMenu

	public static void newHire(Scanner keyboard)
	{
		String lastName, firstName, email, title = " ";
		int salary, empID, empid2 = 0;

		System.out.println("Please enter new employee's First name :");
		firstName = keyboard.next();

		System.out.println("Please enter new employee's last name :");
		lastName = keyboard.next();

		System.out.println("Please enter new employee'semail address :");
		email = keyboard.next();

		System.out.println("Please enter new employee's title :");
		title = keyboard.next();

		System.out.println("Please enter new employee's salary:");
		salary = keyboard.nextInt();

		System.out.println("Please enter new employee's empID :");
		empID = keyboard.nextInt();

		empid2 = empID;
		Employee test1 = new Employee(firstName, lastName, email, salary);
	}

}