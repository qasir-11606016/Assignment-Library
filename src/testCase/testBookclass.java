package testCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import library.entities.Book;
import library.entities.Loan;
import library.interfaces.entities.IBook;

public class testBookclass {

	IBook book1=new Book("Book1","title1","24",23);

	@Test
	public void testgetauthor() {
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals("Book1",book1.getAuthor());
		
	}
	@Test
	public void testGetTitle() {
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals("title1",book1.getTitle());
		
	}
	@Test
	public void testGetCallNumber() {
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals("24",book1.getCallNumber());
	}
	@Test
	public void testGetId(){
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals(23,book1.getID());
	}
	
	@Test
	public void bookstatus(){
		book1.getState();
		assertEquals(book1.getState(),book1.getState());
		
		
	}

}
