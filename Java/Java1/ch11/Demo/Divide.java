package Demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num1, num2 = 0;

		System.out.println("Please enter the integer");
		num1 = keyboard.nextInt();
		System.out.println("Please enter the integer");
		num2 = keyboard.nextInt();

		try
		{
			double result = num1 / num2;
			System.out.println(result);
			System.out.println("End of try block");

		} catch (ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
			System.out.println(e);
		}
	catch(InputMismatchException e)

	{
		System.out.println("You must enter a number");
		System.out.println(e);
	}
	System.out.println("End of program");

	keyboard.close();

}}
