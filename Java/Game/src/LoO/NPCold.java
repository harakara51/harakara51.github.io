package LoO;

public class NPCold
{
	private String Name;
	private int HP;
	private int MP;
	private int Attack;
	private int Defense;
	
//constructor	
	public NPCold(String name, int hP, int mP, int attack, int defense)
	{
		Name = name;
		HP = hP;
		MP = mP;
		Attack = attack;
		Defense = defense;
	}

	boolean isAlive ()
	{
		if(this.HP <= 0)
			return false;
		else
			return true;
		
		
	}
	
	public void inflictDamageToMe (NPCold npc)
	{
		this.HP -= npc.getAttack();
	}
	
	public  int movePlayer ()
	{
		return 1;
	}
	
	public void startAttack ()
	{
		
	} 
	
	public int defend ()
	{
		return 1;
	}
	
	public int heal ()
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
	public int getHP()
	{
		return HP;
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
	public int getAttack()
	{
		return Attack;
	}

	/**
	 * @return the defense
	 */
	public int getDefense()
	{
		return Defense;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		Name = name;
	}


	/**
	 * @param hP the hP to set
	 */
	public void setHP(NPCold npc)
	{
		npc.HP -= npc.getAttack();
	}


	/**
	 * @param mP the mP to set
	 */
	public void setMP(int mP)
	{
		MP = mP;
	}


	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack)
	{
		Attack = attack;
	}


	/**
	 * @param defense the defense to set
	 */
	public void setDefense(int defense)
	{
		Defense = defense;
	}
	
	
		
	
	
	
	
}