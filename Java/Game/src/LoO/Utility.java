package LoO;

public class Utility
{
	public void damage (NPCold attacker, NPCold defender)
	
	{
		int damage = attacker.getAttack();
			int hp = defender.getHP();
			hp -= damage;
			System.out.println("Your opponent took " + damage + " damage. It hp is now " + hp);
	}
	
}
