
public class Book {

	private String name;
	private String publishDate;
	private String author;
	
	public Book(String name, String publishDate, String author) {
		super();
		this.name = name;
		this.publishDate = publishDate;
		this.author = author;
	}
	
	public String toString()
	{
		return this.name + this.publishDate + this.author;
	}
}
