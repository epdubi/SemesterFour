
public class LibDriver {

	public static void main(String[] args) {

		Book b = new Book("Fight Club ", "1/11/2000 ", "DJ HALL");
		Library lib = new Library("STL LIB ", b);
		System.out.println(lib.toString());
	}

}
