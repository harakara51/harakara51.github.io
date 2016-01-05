package LoO;

public class Items
{

	private String name;
    private int plusDamage;
    private int plusHealth;
    private int plusMp;
    private int plusDef;
    
    public Items()
    {
       
    }
    
    
    public Items(String n, int pD, int pH, int pM,int pDef)
    {
        this.name = n;
        this.plusDamage = pD;
        this.plusHealth = pH;
        this.plusMp = pM;
        this.plusDef = pDef;
    }
    
    public String getName()
    {
        return name;
    }
    public int getPlusDamage()
    {
        return plusDamage;
    }
    public int getPlusHealth()
    {
        return plusHealth;
    }
    public int getPlusMp()
    {
        return plusMp;
    }
    public int getPlusDef()
    {
        return plusDef;
    }
    public void randomItemGet(NPC player)
    {
        int random = (int)(Math.random()*100)+1;
        int rand = (int)(Math.random()*2) +1;
        
        if (random >= 1 && random <= 40)
        {
            if (rand == 1)
            {
                Items clothArmor = new Items("Cloth Armor", 0, 10, 0 , 2);
                player.equipArmor(clothArmor);
            }
            else
            {
                Items woodenSword = new Items("Wooden Sword", 5, 0, 0, 0  );
                player.equipArmor(woodenSword);
            }
        }
        else if(random >= 41 && random <=70)
        {
            if(rand ==1 )
            {
                
                Items leatherArmor = new Items("Leather Armor", 0, 25, 0 , 5);
                player.equipArmor(leatherArmor);
            }
            else
            {
                Items bronzeSword = new Items("Bronze Sword" , 10 ,0 ,0 ,0);
                player.equipArmor(bronzeSword);
            }
        }
        else if (random >= 71 && random <= 90)
        {
            if(rand ==1)
            {

                Items chainmailArmor = new Items("Chainmain Armor", 0, 50, 0 , 10);
                player.equipArmor(chainmailArmor);
            }
            else
            {

                Items ironSword = new Items("Iron Sword" ,15 ,0 ,0 ,0);
                player.equipArmor(ironSword);
            }
        }
        else
        {
            if (rand == 1)
            {

                Items plateArmor = new Items("Plate Armor", 0, 100, 0 , 20);
                player.equipArmor(plateArmor);
            }
            else
            {
                Items steelSword = new Items("Steel Sword",20,0,0,0);
                player.equipArmor(steelSword);
            }
        }
    }
}

