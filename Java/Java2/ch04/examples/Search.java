package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Search
{
	public static void main(String[] args)
	{
		BufferedReader bufIn = null;
		try
		{
			bufIn = new BufferedReader(new FileReader("employee.txt"));

			String line;
			while ((line = bufIn.readLine()) != null)
			{
				// String [] test = line..split(delimiters);
				// if (line.contains("manager"))
				// if (line.indexOf("manager") >5)

				String[] parts = line.split(",");
				if (parts[3].equals("manager"))
				{
					System.out.println(parts[3]);
				}
				//System.out.println(parts[3]);
				// System.out.println(line);
			}

		} catch (IOException e)
		{
			System.err.println(e);
		} finally
		{
			if (bufIn != null)
			{
				try
				{
					bufIn.close();
				} catch (IOException e)
				{
					System.err.println(e);
				}
			}
		}
	}
}
