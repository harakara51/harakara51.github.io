package LoO;

import java.util.Scanner;

public class BattleSequence
{
//	Utility util;
//	
//	
//	public BattleSequence(Utility util)
//	{
//		super();
//		this.util = util;
//	}
//	
	public void Battle(NPC player, NPC monster1, GameMenu gm, printMap map1)
    {
		
		
	
		
        Scanner keyboard = new Scanner(System.in);
        while(true)
        {
            
        	
        	gm.printGameMenu(player, monster1, map1);
            //int monsterChoice = (int) (Math.random() * 10);
        	System.out.println("Type ATTACK to ATTACK");
            UserCommand userChoice = UserCommand.valueOf(keyboard.next().toUpperCase());
            
            
            if(userChoice == UserCommand.ATTACK)
            {
            	
                monster1.inflictDamageToMe(player);
            }
//            else if (userChoice == UserCommand.DEFEND)
//            {
//                player.defend();
//            }
//            else
//            {
//                player.heal();
//            }
            
            gm.printGameMenu(player, monster1, map1);
            
            
            monster1.isAlive();
            if (monster1.isAlive() == false)
            {
            	gm.printGameMenu(player, monster1, map1);
            	System.out.println("You won the battle!");
            	monster1 = null;
                break;
            }
            
          player.inflictDamageToMe(monster1);
            
            
            if (player.isAlive() == false)
            {
            	gm.printGameMenu(player, monster1, map1);
            	System.out.println("You lose!");
                break;
            }
            
            
//            if(monsterChoice )
//            {
//                
//            }
//            else if()
//            {
//                
//            }
//            else
//            {
//                
//            }
        }
 //       keyboard.close();
    }

	

    public void battleMenuChoice()
    {
        System.out.println("Please choose an action:(type the word) ");
        System.out.println("1: Attack");
        System.out.println("2: Defend");
        System.out.println("3: Heal");

    }



	
}