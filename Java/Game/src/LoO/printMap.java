package LoO;

public class printMap
{
	public char [] [] map = {{'X', ' ', ' ' },
				{' ', ' ', ' ' },
				{' ', ' ', ' ' }};
		
		
	
public void drawMap ()
{
		
		for (int i = 0; i < map.length; i++)
		{
			System.out.println(" ");
			for (int j = 0; j < map.length; j++)
			{
				System.out.print(map[i][j]);
			}
		}
		System.out.println(" ");

}


public void updateMap (int x, int y)
{
	for (int i = 0; i < map.length; i++)
	{
		System.out.println(" ");
		for (int j = 0; j < map.length; j++)
		{
			System.out.print(map[i][j]);
		}
	}
	System.out.println(" ");
}

}
