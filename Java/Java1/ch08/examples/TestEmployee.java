package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class TestEmployee
{

	public static int managerChoice = 0;
	public static int numHolder = 0;

	public static ArrayList<Employee> employ = new ArrayList<Employee>();
	public static Employee[] current = new Employee [10];

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
		setEmployees();
		while (true)
		{
			
//			setCurrentEmployeesArray();

			System.out.println("1: List employees.");
			System.out.println("2: Hire employee.");
			System.out.println("3: Fire employee");
			System.out.println("4: Search employee");
			System.out.println("5: Sort by Salary");
			System.out.println("6: Test Program");
			System.out.println("7: Quit program.");
			System.out.println("Please choose 1-5");
			managerChoice = keyboard.nextInt();
			userChoice(managerChoice);
			if (managerChoice == 7)
			{
				break;
			} else if (managerChoice == 1)
			{
				listEmployees();
			}

			else if (managerChoice == 2)
			{
				newHire(keyboard);
			} else if (managerChoice == 3)
			{
				fireEmployees(keyboard);
			} else if (managerChoice == 4)
			{
				searchEmployees(keyboard);
			} else if (managerChoice == 5)
			{
				sortBySalaries();
			}
			else if (managerChoice == 6)
			{
				testArratlist(keyboard);
			}
		} // end loop
	}// end startMenu

	public static void setEmployees()
	{
		Employee David = new Employee();
		David.setFirstName("Dated");
		David.setLastName("Mushroom");
		David.setSalary(83000);
		David.setTitle("Manager");

		employ.add(David);

		Employee John = new Employee();
		John.setFirstName("John");
		John.setLastName("doeer");
		John.setSalary(57000);
		John.setTitle(" Branch Manager");

		employ.add(John);

		Employee Nino = new Employee();
		Nino.setFirstName("Nina");
		Nino.setLastName("doeer");
		Nino.setSalary(53000);
		Nino.setTitle(" Assitant manager");

		employ.add(Nino);

		Employee Elizabeth = new Employee();
		Elizabeth.setFirstName("Elizabeth");
		Elizabeth.setLastName("Shin");
		Elizabeth.setSalary(157000);
		Elizabeth.setTitle(" CEO");

		employ.add(Elizabeth);

		Employee Joe = new Employee();
		Joe.setFirstName("Joe");
		Joe.setLastName("Lund");
		Joe.setSalary(125000);
		Joe.setTitle(" CFO");

		employ.add(Joe);

		Employee Angie = new Employee();
		Angie.setFirstName("Angie");
		Angie.setLastName("Dodson");
		Angie.setSalary(109000);
		Angie.setTitle(" COO");
		employ.add(Angie);

		// int findNull = 0;
		// for (int i = 0; i < employ.size() - 1; i++)
		// {
		// if (employ[i] == null)
		// {
		// findNull = i;
		// break;
		// }
		// }
		// numHolder = findNull;
		// System.out.println(numHolder);
		// setCurrentEmployeesArray();

	}
	public static void newHire(Scanner keyboard)
	{
		String lastName, firstName, email, title = " ";
		int salary, empID = 0;

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

	

		employ.add(new Employee(firstName, lastName, email, salary));

		// setCurrentEmployeesArray();
	}

	// public static void setCurrentEmployeesArray()
	// {
	// for (int i = 0; i < numHolder-1; i++)
	// {
	// current[i] = employ [i];
	//
	// }
	//
	// System.out.println(current);
	//
	//
	// }

	public static void listEmployees()
	{

		for (int i = 0; i < employ.size(); i++)
		{
			System.out.println(employ.get(i));
			//System.out.println(employ.size());
		}

	}
	
	public static void testArratlist (Scanner keyboard)
	{
		int index = 0;
		System.out.println("Enter the index, of the object you want information of");
		index =keyboard.nextInt();
		
		System.out.println(employ.get(index).getFirstName());
	}
	public static void fireEmployees(Scanner keyboard)
	{
		String fName = " ";
		String lName = " ";
		System.out.println("Enter the first name of the person to be fired :");
		fName = keyboard.next();
		System.out.println("Enter last name of the person to be fired :");
		lName = keyboard.next();

		for (int i = 0; i < numHolder - 1; i++)
		{
			if ((employ.get(i).getFirstName()) == fName)
			{
				System.out.println("Test testing for loop for fire method " + i);
				employ.remove(i);
				break;
			}
		}

		// setCurrentEmployeesArray();
	}
	public static void searchEmployees(Scanner keyboard)
	{
		String fName = " ";
		// String lName = " ";
		System.out.println("Enter the first name of the person you want to search :");
		fName = keyboard.next();
		// System.out.println("Enter last name of the person to be fired :");
		// lName = keyboard.next();

		for (int i = 0; i < numHolder - 1; i++)
		{
			if ((employ.get(i).getFirstName()) == fName)
			{
				System.out.println("Test testing for loop for fire method " + i);
				employ.get(i);
				break;
			}
		}

	}

	public static void sortBySalaries()
	{
	 
		
       employ.sort(new salaryComparator());

		System.out.println("Sorted list entries: ");
        for(Employee e:employ)
        {
            System.out.println(e);
        }
	}
        
//		System.out.println("Order of Employees before sorting is: ");
//
//		for (int i = 0; i < numHolder-1; i++)
//		{
//			System.out.println(current[i].getFirstName() + "\t" + current[i].getSalary());
//		}
//
//		Arrays.sort(employ, new salaryComparator());
//		System.out.println("Order of Employees after sorting is");
//
//		for (int i = 0; i < numHolder; i++)
//		{
//			System.out.println(current[i].getFirstName() + "\t" + current[i].getSalary());
//		}	
//	}
	

}