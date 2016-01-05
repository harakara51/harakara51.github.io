package LoO;

public class NPC
{
	
		    private String Name;
			    private int HP;
			    private int MP;
			    private int Attack;
			    private int Defense;

			    public Items[] armorEquiped = new Items[1];
			    public Items[] weaponEquiped = new Items[1];

			

			    // constructor
			    public NPC(String name, int hP, int mP, int attack, int defense)
			    {
			        Name = name;
			        HP = hP;
			        MP = mP;
			        Attack = attack;
			        Defense = defense;
			        Items temp = new Items ("Initial ",0,0,0,0);
			        armorEquiped[0] = temp;
			        weaponEquiped[0] =temp; 
			        
			    }

			    boolean isAlive()
			    {
			        if (this.HP <= 0)
			            return false;
			        else
			            return true;

			    }

			    public void heal (int potion)
			    {
			    	if(this.HP < 102)
			    	{	
			    	this.HP = this.HP + potion;
			    	}
			    }
			    public void inflictDamageToMe(NPC npc)
			    {
			        int itemDamage = getItemDamage();

			        this.HP -= npc.getAttack(itemDamage, this.getDefense());

			    }

			    public int movePlayer()
			    {
			        return 1;
			    }

			    public void startAttack()
			    {

			    }

			    public int defend()
			    {
			        return 1;
			    }

			    public int heal()
			    {
			        return 1;
			    }

			    /**
			     * @return the name
			     */
			    public String getName()
			    {
			        return Name;
			    }

			    /**
			     * @return the hP
			     */
			    public void getHP()
			    {

			        int itemHp = weaponEquiped[0].getPlusHealth();

			        HP = HP + itemHp;
			        System.out.println(HP);
			    }

			    /**
			     * @return the mP
			     */
			    public int getMP()
			    {
			        return MP;
			    }

			    /**
			     * @return the attack
			     */
			    public int getAttack(int itemDamage, int getDefense)
			    {

			        return (int) (Math.random() * ((Attack + itemDamage + 1)) + ((Attack - getDefense)));
			    }

			    /**
			     * @return the defense
			     */
			    public int getDefense()
			    {
			        return Defense + armorEquiped[0].getPlusDef();
			    }

			    /**
			     * @param name
			     *            the name to set
			     */
			    public void setName(String name)
			    {
			        Name = name;
			    }

			    /**
			     * @param hP
			     *            the hP to set
			     */
			    public void setHP(int Hp)
			    {
			        HP = Hp;
			    }

			    /**
			     * @param mP
			     *            the mP to set
			     */
			    public void setMP(int mP)
			    {
			        MP = mP;
			    }

			    /**
			     * @param attack
			     *            the attack to set
			     */
			    public void setAttack(int attack)
			    {
			        Attack = attack;
			    }

			    /**
			     * @param defense
			     *            the defense to set
			     */
			    public void setDefense(int defense)
			    {
			        Defense = defense;
			    }

			    public void equipArmor(Items item)
			    {
			        if (!(HP - armorEquiped[0].getPlusHealth() < 0))
			        {
			            HP -= armorEquiped[0].getPlusHealth();
			            armorEquiped[0] = null;
			            armorEquiped[0] = item;
			            HP += armorEquiped[0].getPlusHealth();
			        }
			        else
			        {
			            System.out.println("");
			        }

			    }

			    public void equipWeapon(Items item)
			    {

			    }

			    public int getItemDamage()
			    {
			        int itemDamage = weaponEquiped[0].getPlusDamage();
			        return itemDamage;
			    }

			    public int getItemDefense()
			    {
			        int itemDefense = armorEquiped[0].getPlusDef();
			        return itemDefense;
			    }
			}



