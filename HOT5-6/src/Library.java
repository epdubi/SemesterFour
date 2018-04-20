
public class Library {

	private String name;
	private Book book1;
	
	public Library(String name, Book b)
	{
		this.name = name;
		this.book1 = b;
	}
	
	public String toString()
	{
		return "Name: " + this.name + "\nBook: " + this.book1;
	}
}
