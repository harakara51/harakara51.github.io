package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadPResident2
{

	public static ArrayList<Presidents> PresidentList2 = new ArrayList<Presidents>();
	public static String line2;

	public static void main(String[] args)
	{

		BufferedReader bufIn2 = null;

		try
		{
			bufIn2 = new BufferedReader(new FileReader("presidents.txt"));

			while ((line2 = bufIn2.readLine()) != null)
			{
				//System.out.println(line2);
				String[] parts = line2.split(" ");
				
				 if (parts[4].length() <= 4)
					{

					String startYear = parts[4].substring(0, 4);
					String endYear = "NA";
					
							Presidents george = new Presidents(parts[0], startYear, endYear, parts[1], parts[3], parts[2],
							parts[4]);

					PresidentList2.add(george);
					}
				 
				 else if (parts[4].length() > 15 && parts[4].contains("1"))
					{
				
					String startYear = parts[4].substring(0, 4);
					String endYear =parts[4].substring(5, 9);
					String party = parts[4].substring(9);
					
					
							Presidents george = new Presidents(parts[0], startYear, endYear, parts[1], parts[2], parts[3],
							party);

					PresidentList2.add(george);
					}
				
				 else if(parts.length ==5)
				{
				String startYear = parts[3].substring(0, 4);
				String endYear = parts[3].substring(5);
				
				if(endYear.length()==1)  
				{
					endYear = " " +startYear.substring(0, 3) + endYear; 
				}
				if(endYear.length()<3)
				{
					endYear = " " +startYear.substring(0, 2) + endYear; 
				}
				
				Presidents george = new Presidents(parts[0], startYear, endYear, parts[1], " ", parts[2],
						parts[4]);
				PresidentList2.add(george);
				}
				
				 else if (parts.length ==6)
					{
					String startYear = parts[4].substring(0, 4);

//				String endYear = "test";	
				String endYear = parts[4].substring(5);
					
					if(endYear.length()<3)
					{
						endYear = " " +startYear.substring(0, 2) + endYear; 
					}
					Presidents george = new Presidents(parts[0], startYear,endYear, parts[1], parts[2], parts[3],
							parts[5]);

					PresidentList2.add(george);
				}
				 else if (parts.length ==7)
					{
					String startYear = parts[5].substring(0, 4);

//				String endYear = "test";	
				String endYear = parts[5].substring(5);
					
					if(endYear.length()<3)
					{
						endYear = " " +startYear.substring(0, 2) + endYear; 
					}
					Presidents george = new Presidents(parts[0], startYear,endYear, parts[1], parts[2] + " " + parts[3], parts[4],
							parts[6]);

					PresidentList2.add(george);
				}
			
			}
		
			for (int i = 0; i < PresidentList2.size(); i++)
			{

				PresidentList2.get(i).display2();
			}

		} catch (IOException e)
		{
			System.err.println(e);
		} finally
		{
			if (bufIn2 != null)
			{
				try
				{
					bufIn2.close();
				} catch (IOException e)
				{
					System.err.println(e);
				}
			}
		}
	}
}