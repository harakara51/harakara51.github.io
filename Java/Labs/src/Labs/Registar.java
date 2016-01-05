package Labs;


	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Registar
	{
		public static double billCount;
		public static double cost;
		public static double change;
		public static double customerInput;
		public static double remainder;

		
		public static void calculateChange()
		{

			change = (Math.round((customerInput - cost) * 100d) / 100d);
			if (change < 0)
			{
				System.out.println("You need to pay $" + Math.abs(change) + " dollar more");
			} else if (change > 0)
			{
				System.out.println(" We owe you " + change + " dollar more");
			} else
				System.out.println("Transcation is complete, thank you for your bussiness");

		}

		public static void findChange()

		{
			double[] changeBill =
			{ 20, 10, 5, 1, .5, .25, .1, .05, .01 };

			String[] currencyName =
			{ "twenty", "ten", "five", "one", "fifty-cent", "quarter-cent", "dime", "nickel", "cent" };
			System.out.print(" Here is ");

			for (int i = 0; i < (changeBill.length); i++)
			{
				if (change >= changeBill[i])
				{
					billCount = (change / changeBill[i]);
					remainder = change % changeBill[i];
					change = remainder;
					
					if (i <= 3)
					{
						System.out.print(" " + (int) billCount + "  " + currencyName[i] + " dollars bills, ");

					}
					if (i >= 3)
					{
						if (remainder >0 && remainder <.01)
						{
							billCount++;
						}
						System.out.print(" " + (int) billCount + "  " + currencyName[i] + " coin, ");
					}
					
				} // end of if statement
			} // end of for loop
		}// end of method

	}// end of class 


