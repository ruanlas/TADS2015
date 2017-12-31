
public class Book {
	private String title;
	private String isbn;
	private Author author;
	private Publisher publiser;
	
	public Book(String title, String isbn, Author author, Publisher publisher) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.publiser = publisher;
	}
	
	public Book(Author author) {
		this("", "000.0000.000", author, null);
	}
	public void print() {
		System.out.println("--------------------------");
		System.out.println(" -  Title: "+this.title);
		System.out.println(" -  ISBN: "+this.isbn);
		System.out.println("--------------------------");
		this.author.print();
	}

}
