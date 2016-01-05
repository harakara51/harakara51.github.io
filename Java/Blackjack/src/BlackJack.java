import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JComponent;

public class BlackJack
{
	public static List<Cards> hand = new ArrayList<Cards>();
	public static List<Cards> AIhand = new ArrayList<Cards>();
	public static int userChoice;
	public static int userScore;
	public static int userScore2;
	public static int userTurn;
	public static boolean hasAce;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
//		GameWindow BJ = new GameWindow();
//		MyCanvas Images = new MyCanvas();
//		BJ.add(Images);
//		Image img1 = Toolkit.getDefaultToolkit().getImage("test.png");
//		img1.getWidth(null);
		AI();
		startGame(keyboard);
		playGame(keyboard);
		keyboard.close();
		

	}

	public static void AI()
	{
		Cards hand1 = new Cards();
		Cards hand2 = new Cards();
		AIhand.add(hand1);
		AIhand.add(hand2);

	}

	public static void startGame(Scanner keyboard)
	{

		Cards hand1 = new Cards();
		Cards hand2 = new Cards();
		hand.add(hand1);
		hand.add(hand2);
		printHand();
		
	}
	
	public static void playGame (Scanner keyboard)
	{

		while (userScore < 21)
		{

			if (userTurn == 0)
			{
				PlayersTurn(keyboard);
			} else if (userTurn == 1)
			{
				AITurn();
			}
		}

	}

	public static void PlayersTurn(Scanner keyboard)
	{
		for (Cards cards : hand)
		{
			
			userScore = userScore + cards.getNumber();
			userScore2 = userScore; 
			if(cards.getNumber()==1)
			{
				userScore2 += 10;
				hasAce = true;
			}
		}
		
		if(hasAce)
		{
			System.out.println(" PLayer score   +  :" + userScore + " or " + userScore2);	
		}
		else
		{	
		System.out.println(" PLayer score   @  :" + userScore);	
		}
	
		
		while (userChoice != 2 )
		{	
			System.out.println("Press 1 to hit or press 2 to Stand");
			userChoice = keyboard.nextInt();

			
			if(userChoice ==2)
			{
				if (hasAce)
				{
					System.out.println(" PLayer score     : " + userScore + " or " + userScore2);	
				}
				else
				{
				System.out.println(" PLayer score     :" + userScore);
				}
				break;
			}
			
			
			Cards hand3 = new Cards();
			hand.add(hand3);
            
			int playerLastCard = hand.size() -1;
			
			userScore = userScore + hand.get(playerLastCard).getNumber();
			userScore2 = userScore2 + hand.get(playerLastCard).getNumber();
					

			System.out.println(" You got a :" + hand.get(2).getNumber());

			if (userScore > 21)
			{
				System.out.println(hand.get(playerLastCard).getNumber());
				System.out.println("your Current score is : " + userScore);
				System.out.println("Bust! You lose");
				System.exit(0);
			}
			if (hasAce)
			{
				System.out.println(" PLayer score     : " + userScore + " or " + userScore2);	
			}
			else
			{
			System.out.println(" PLayer score     :" + userScore);
			}		

		}

		userTurn = 1;

		
		//	System.out.println(" PLayer score   Final  : " + userScore + " or " + userScore2);	
		


	}

	public static void AITurn()
	{
		int aiScore = 0;
		while (aiScore < 22)
		{
			System.out.println("Bankers cards are :");
			for (Cards cards : AIhand)
			{
				cards.getNumber();
				aiScore = aiScore + cards.getNumber();
			}
			
			if (AIhand.contains(1))
			{
				System.out.println("test");
			}

			while (aiScore < 17)
			{
				Cards hand3 = new Cards();
				AIhand.add(hand3);
				int lastCard = AIhand.size() - 1;
				aiScore += AIhand.get(lastCard).getNumber();
				System.out.println("Banker draws :" + AIhand.get(lastCard).getNumber());

				System.out.println("Bankers score   : " + aiScore + " PLayer score     :" + userScore);

			}
			
			if (aiScore > 21)
			{
				System.out.println("Bankers goes bust!, you win, his score was :" + aiScore);
				System.exit(0);
			} else if ((aiScore > 17) && (aiScore > userScore))
			{
				System.out.println("Bankers wins,  his score is :" + aiScore);
				System.exit(0);
			} else if ((aiScore > 17) && (aiScore < userScore))
			{
				System.out.println("Bankers loses,  his score is :" + aiScore);
				System.exit(0);
			} else
			{
				System.out.println("it a draw");
				System.exit(0);
			}
		}
	}

	public static void printHand()
	{
		System.out.print("Player hand: ");
		System.out.print(hand.get(0).getNumber() + "  ");
		System.out.println(hand.get(1).getNumber());

		System.out.print("Bankers hand:");
		System.out.println(AIhand.get(0).getNumber());

	}

}


