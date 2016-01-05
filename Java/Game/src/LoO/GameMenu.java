package LoO;

public class GameMenu
{
    public void printGameMenu(NPC player, NPC monster, printMap map1)
    {
    
    	
   
       map1.drawMap();
       System.out.print("Player health : ");
       player.getHP();
       
       System.out.print("\t\t Monster health :");
       monster.getHP();
       // System.out.printf("Player Health: %1$d              Monster Health: %2$d", player.getHP(), monster.getHP());
        System.out.println("");
        
        
    }
}