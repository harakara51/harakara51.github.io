package Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NBADraftPicker

{
	public static ArrayList<Seed> NBAPicks = new ArrayList<Seed>();
	public static Map<String, Number> draftResults = new HashMap<>();

	public static void main(String[] args)
	{
		draftSet();
		System.out.println(NBAPicks.size());
	//	pickDraft();
		pickDraft1000();

		printResults();
	}

	public static void draftSet()
	{
		int counter = 0;
		Seed one = new Seed("Sixers", 250, 1,0);
		Seed two = new Seed("Lakers", 199, 2,0);
		Seed three = new Seed("Nets", 156, 3,0);
		Seed four = new Seed("Pelican", 119, 4,0);
		Seed five = new Seed("TimberWolves", 88, 5,0);
		Seed six = new Seed("Bucks", 63, 6,0);
		Seed seven = new Seed("Kings", 43, 7,0);
		Seed eight = new Seed("Sun", 28, 8,0);
		Seed nine = new Seed("Blazers", 17, 9,0);
		Seed ten = new Seed("Jazz", 11, 10,0);
		Seed eleven = new Seed("Wizards", 8, 11,0);
		Seed twelve = new Seed("Knicks", 7, 12,0);
		Seed thirteen = new Seed("Celtics", 6, 13,0);
		Seed fourteen = new Seed("Hawks", 5, 14,0);
		String[] seeds =
		{ "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
				"fourteen" };

		NBAPicks.add(one);
		NBAPicks.add(two);
		NBAPicks.add(three);
		NBAPicks.add(four);
		NBAPicks.add(five);
		NBAPicks.add(six);
		NBAPicks.add(seven);
		NBAPicks.add(eight);
		NBAPicks.add(nine);
		NBAPicks.add(ten);
		NBAPicks.add(eleven);
		NBAPicks.add(twelve);
		NBAPicks.add(thirteen);
		NBAPicks.add(fourteen);

		for (int i = 0; i < 14; i++)
		{
			while (counter < (NBAPicks.get(i).getValue() - 1))
			{
				NBAPicks.add(NBAPicks.get(i));
				counter++;
			}
			counter = 0;

		}

	}

	public static void pickDraft()
	{
		Collections.shuffle(NBAPicks);
		// System.out.println(NBAPicks.get(0));

	}

	public static void pickDraft1000()
	{
		
		//Number [] numOfPicks = new  Number [14];
		for (int i = 0; i < 100000; i++)
		{

			Collections.shuffle(NBAPicks);

			if (draftResults.containsKey((NBAPicks.get(0).getName())))
			{
				NBAPicks.get(0).setWins(1);

			} else
			{
				NBAPicks.get(0).setWins(1);

			}
			
			draftResults.put((NBAPicks.get(0).getName()), NBAPicks.get(0).getWins());
			
		}
	}

	public static void printResults()
	{

		for (String S : draftResults.keySet())
		{
			String key = S.toString();
			Number value = draftResults.get(S);

			System.out.printf("%-40s - %4d\n", key, value);

		}
	}

}
