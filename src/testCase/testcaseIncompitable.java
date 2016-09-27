package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.entities.Book;
import library.interfaces.entities.IBook;

public class testcaseIncompitable {

	@Test
	public void testIncompitableGetAuthor() {
		IBook book1=new Book(1,"title1","24",12);

	}
	@Test
	public void testIncompitableGetTitle() {
		IBook book1=new Book("Book1",22,"24",23);

	}
	@Test
	public void testIncompitableGetId() {
		IBook book1=new Book(Book1,"title1","24","true");

	}
	@Test
	public void testIncompitableCallerId() {
		IBook book1=new Book("Book1","title1",24,2);

	}

}
