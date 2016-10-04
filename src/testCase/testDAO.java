package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.daos.BookHelper;
import library.entities.Book;
import library.interfaces.entities.IBook;

public class testDAO {

	@Test
	public void bookHelpertest() {
		IBook book1=new Book("Book1","title1","24",23);
		BookHelper bookHelp=new BookHelper();
		IBook book2=bookHelp.makeBook("Book1","title1","24",23);
		assertEquals("",book2,book1);
		
	}

}
