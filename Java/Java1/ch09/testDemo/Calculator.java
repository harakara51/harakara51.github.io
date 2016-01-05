package testDemo;

import com.sun.corba.se.impl.presentation.rmi.ExceptionHandler;

public class Calculator
{
	private int num1, num2, ans;

	private double number1, number2, answer;

	public Calculator()
	{

	}
	public Calculator(int num1, int num2)
	{

		this.num1 = num1;
		this.num2 = num2;
	}

	public int add(int num1, int num2)
	{
		ans = num1 + num2;
		return (ans);
	}

	public double add(double number1, double number2)
	{
		answer = number1 + number2;

		return answer;
	}

	public int subtract(int num1, int num2)
	{
		ans = num1 - num2;
		return (ans);
	}

	public double subtract(double number1, double number2)
	{
		answer = number1 - number2;

		return answer;
	}

	public int multiply(int num1, int num2)
	{
		ans = num1 * num2;
		return (ans);
	}

	public double multiply(double number1, double number2)
	{
		answer = number1 * number2;

		return answer;
	}

	public int divide(int num1, int num2)
	{
		ans = num1 / num2;

		if (num2 == 0)
		{
			throw new ArithmeticException("denominator cannot be 0!");
		}
		return (ans);
	}
	public double divide(double num1, double num2)
	{
		answer = num1 / num2;

		if (num2 == 0)
		{
			throw new ArithmeticException("denominator cannot be 0!");
		}
		return (answer);
	}

	/**
	 * @return the num1
	 */
	public int getNum1()
	{
		return num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2()
	{
		return num2;
	}

	/**
	 * @param num1
	 *            the num1 to set
	 */
	public void setNum1(int num1)
	{
		this.num1 = num1;
	}

	/**
	 * @param num2
	 *            the num2 to set
	 */
	public void setNum2(int num2)
	{
		this.num2 = num2;
	}
	/**
	 * @return the number1
	 */
	public double getNumber1()
	{
		return number1;
	}
	/**
	 * @return the number2
	 */
	public double getNumber2()
	{
		return number2;
	}
	/**
	 * @param number1
	 *            the number1 to set
	 */
	public void setNumber1()
	{
		this.number1 = (double) num1;
	}
	/**
	 * @param number2
	 *            the number2 to set
	 */
	public void setNumber2()
	{
		this.number2 = (double) num2;
	}

}
