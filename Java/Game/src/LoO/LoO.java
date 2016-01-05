package LoO;

import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class LoO
{

	public static int userChoice;
	public static int random1;
	public static String movement;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		gameMenu(keyboard);

		startGame(keyboard);

		
	}

	public static void startGame(Scanner keyboard)
	{
		System.out.println(" ");

		if (userChoice == 1)
		{

			printMap map1 = new printMap();

			String name;

			System.out.println("Please enter the name of the character");
			name = keyboard.next();

			map1.drawMap();

			NPC player = new NPC(name, 100, 75, 8, 1);

	//		NPC monster1 = new NPC("Monster", 20, 30, 2, 1);
			
			NPC BOSS = new NPC("BOSS", 100, 80, 15, 1);

			Maps startingZone = new Maps(3, 3, 0, 0);
			startingZone.mapBuild();
			while (true)
			{
				Items test = new Items();
				System.out.println("Press W,A,S D to move: ");
				movement = keyboard.next();
				startingZone.mapBuild();
				charMover(keyboard, startingZone);
				//startingZone.mapBuild();
				
				System.out.println(" X is : " + startingZone.getX() + " Y is : " + startingZone.getY());
				NPC monster1 = new NPC("Monster", 20, 30, 2, 1);
				random1 = ((int)(Math.random()*3) +1);
				if ((startingZone.getX()==2) && (startingZone.getY()==2))
				{
					System.out.println("You encountered the boss ");
					BattleSequence bs = new BattleSequence();
					GameMenu gm = new GameMenu();
					bs.Battle(player, BOSS, gm, map1);
					
					
				}
				else
				{
					if (random1 ==1)
					{
						System.out.println("You encountered a monsters ");
							try
							{
							BattleSequence bs = new BattleSequence();
	
							GameMenu gm = new GameMenu();
							//gm(player, monster1, gm);
	
							bs.Battle(player, monster1, gm, map1);
							}
							catch (Exception e)
							{
								System.out.println(e);
							}
					}
					else if (random1 ==2)
					{
						System.out.println("You found a potion, your hp has been restored");
						player.heal(10);
					}
					else
					{
						System.out.println("There is nothing here");
						
					}
				}
//				
				
			}

				

		}
//		keyboard.close();
	}

	// this method brings ups the game Menu
	public static void gameMenu(Scanner keyboard)
	{
		System.out.println("\t \t 1) Start game \t \t");
		System.out.println(" ");
		System.out.println("\t \t 2 )Customize game  \t \t  ");
		System.out.println(" ");
		System.out.println("\t \t 3) Quit game  \t \t ");
		userChoice = keyboard.nextInt();
	}

	public static void charMover(Scanner keyboard, Maps map)
	{
		if (movement.equalsIgnoreCase("S"))
		{
			if ((map.getX()  < 0) || (map.getX() >=2))
			{
				System.out.println("You cannot move there");
				System.out.println("Value of X is " + map.getX() + "Pressing S and X inside exception  X is greater than 2 or less than 0" );
				
			}	
			else 
			{
				map.setX(1);
			}
		} 
		
		else if (movement.equalsIgnoreCase("W"))
		{
			if ((map.getX()  <= 0) )
			{
				System.out.println("You cannot move there");
				System.out.println("Value of X is " + map.getX() + " X and Pressing W inside exception is less than 0  or greatar than 2" );
				

			}
		
			else 
			{
				map.setX(-1);
				
			}
		}
		
		else if (movement.equalsIgnoreCase("A"))
		{
			if ((map.getY() <=0))
			{
				System.out.println("You cannot move there");
				System.out.println( "Value of Y is " + map.getY() + ", pressing A and  Y inside exception is less than 0" );
				
			}

			else 
			{
				
				map.setY(-1);
			}
		} 
		
		else if (movement.equalsIgnoreCase("D"))
		{
			if ((map.getY()  < 0) || (map.getY() >=2))
			{
				System.out.println("You cannot move there");
				System.out.println("Value of Y is : " + map.getY() + " and Pressing D and Y inside exception, it is greatan than 2" );
				
			}


			else 
			{
				
				map.setY(1);
				
			}
		}

		System.out.println(map.getX() + " X inside exception " + map.getY() + " Y in method outside if statement" );
	}

	// end of method to draw board

}
