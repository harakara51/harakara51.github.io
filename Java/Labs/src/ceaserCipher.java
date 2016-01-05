
import java.util.Scanner;

public class ceaserCipher
{
	public static char[] inputArray = new char[10];
	public static int findNull =0;
	
	public static void main(String[] args)
	
	{   
		String userInput =" ";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter somethining to encrypt");
		userInput = keyboard.nextLine();
		
		storeCh(userInput);
		encrypter();
	}
	
	public static void storeCh (String userInput)
	{
		for (int i =0; i < userInput.length(); i++ )
			
		{
			inputArray[i] = userInput.charAt(i);
		}
		
		for (int i =0; i < inputArray.length-1; i++)
		{
			if(inputArray[i] == 0)
			{
				findNull = i;
				break;
			}
		}		
	}
	
	public static void encrypter ()
	{
		char shifter = ' ';
		for (int j =0; j < findNull; j++)
		{
			shifter =(char)((inputArray[j]) + 3);
				System.out.print(" " +  shifter );
		
		}		
	
	}
	
}
