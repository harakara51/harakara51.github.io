package examples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatin
{
	public static String word;

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a word");
		word = keyboard.nextLine();
		// word ="oround";
		String wordphase [] = word.split(" ");	
		String re = "a|e|i|O|U|A|E|I|O|U";
	//	m.reset(word);
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(word);


		String re2 = "^[aeioAEIOU]";

		Pattern p2 = Pattern.compile(re2);
		Matcher m2 = p2.matcher(word);

		
	
		for (int i =0; i <wordphase.length; i++)
		{
			m.reset(wordphase[i]);
			m2.reset(wordphase[i]);
			String test = wordphase[i];
			
			if (m2.find())
			{
				System.out.print(" " + test + "way" + "  ");
			} 
		
			else if (m.find())
			{
				String pig = (test.substring(m.start()) + test.substring(0, m.start()) + "ay");
			 System.out.print(pig);
			}			
		}		

		
		
		
	}//main class

}//class 