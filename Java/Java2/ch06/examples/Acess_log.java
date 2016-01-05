package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.util.resources.en.LocaleNames_en_SG;

public class Acess_log
{
	public static List<Log> Log = new ArrayList<Log>();
	public static Map<String, Integer> ipLOG = new HashMap<String, Integer>();
	
	public static Integer store2 = 0;

	public static void main(String[] args)
	{
		readFile();
	}

	public static void readFile()
	{
		try (BufferedReader in = new BufferedReader(new FileReader("access_log")))
		{

			String line = null;
			while ((line = in.readLine()) != null)
			{

				String[] store = line.split(" ");
				Pattern p = Pattern.compile(" ");
				Matcher m = p.matcher(line);
				m.reset(line);
				m.find();
				
				String store1 = line.substring(0, m.start());
				if (ipLOG.containsKey(store1))
				{
					store2 = store2 + 1;
				} else
					store2 = 1;
			//	int test = ipLOG.
				Log log1 = new Log(store1,store2);
				Log.add(log1);
 			
				
				
	//			ipLOG.put(store1, store2);
				
			}
				
				LogComparator comparator = new LogComparator();
			Collections.sort(Log, comparator);
				
				Log.sort(comparator);

				System.out.println("Address                                 Number of visits");
				for (int i =0; i <Log.size(); i++)
				{
					//System.out.println(Log.get(i));
					ipLOG.put(Log.get(i).getAddress(), Log.get(i).getVisits());
				}
				
				
 
				for (String name : ipLOG.keySet())

				{
					String key = name.toString();
					int value = ipLOG.get(name);

					System.out.printf("%-40s - %4d\n", key, value);

				}
			

		} catch (IOException e)
		{
			System.err.println(e);
			System.exit(1);
		}
	}
}
