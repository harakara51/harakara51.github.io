package Bingo;

import java.util.Scanner;

public class BingoTester
{
	public static BingoSeed test = new BingoSeed();
	public static String[][] board = new String[5][5];
	public static String answer;
	private static int gameStatus;
	private static int userInput;
	public static int random;

	public static void main(String[] args)
	{
		int a=10;
int b=50;
		
		switch (a)
		
		{
			case  : for (String string : args)
			{
				
			}
		}
			
		gameboard();
		match();
		while (gameStatus != 5)
		{
			Scanner keyboard = new Scanner(System.in);

			if (userInput == 0)
			{

				System.out.println("Press 1 to print out the next Bingo Value?");
				userInput = keyboard.nextInt();

			} else if (userInput == 1)
			{
				newBingoValues();
				match();
				userInput = 0;
			}

		}
	}

	public static void newBingoValues()
	{
		int testrandom = (int) (Math.random() * 5);
		answer = test.getAlpha(0) + String.valueOf(test.getValue(0));
		System.out.println(answer);
	}

	public static void gameboard()
	{

		System.out.println(" B\t I\t N \t G\t O");
		String number = "";
	
		for (int i = 0; i < (board.length); i++)
		{
			//random = (int) (Math.random() * ((i + 1) * multiplier));
			for (int j = 0; j < (board.length); j++)
			{
				test.setAlphabet();
				number = String.valueOf(test.getValue(i));
				board[j][i] = test.getAlpha(i) + number;
				System.out.print(number + " \t");

			}
			System.out.println();
		}
		
		System.out.println(board[0][2] + " " + board[1][2] + " " + board[2][0] + " " + board[3][0]+" "  + board[4][0]);

	}
	public static void match()
	
	
	{ 

		for (String[] strings : board)
		{  
			outerSideloop:
			for (String string : strings)
			{
				//System.out.print(" " + string + "\t");
				if (string.equals(answer))
				{
					System.out.println("Bingo");
				}
			}
		}
	}
}
