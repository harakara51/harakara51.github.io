package examples;

public class BadAgeException extends Exception
{
	public  String getMessage ()
	{
		return "Age is invalid";
	}

}
