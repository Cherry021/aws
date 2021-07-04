package aws.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Books {
	
	private static List<Book> book = new ArrayList<>();

	public static List<Book> getBook() {
		return book;
	}

	public static void setBook(Book book1) {
		book.add(book1);
	}

	public Books(List<Book> book) {
		super();
		this.book = book;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.book.toString();
	}
	

}
