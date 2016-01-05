
public class Book
{

	// fields

	private String title;
	private String author;
	private String genre;
	private boolean fiction;
	// methods

	public String getTitle()
	{
		return title;

	}

	public void setTitle(String t)
	{
		if (title != null || t.equals(" "))
		{
			// throws Exception
		} else
			title = t;
	}

}
