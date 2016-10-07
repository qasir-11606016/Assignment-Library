package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.entities.Book;
import library.interfaces.entities.IBook;

public class testBookClassFailed {

	@Test
	public void testgetauthor() {
		IBook book1=new Book("Book1","book title","24",23);
		assertEquals("blue",book1.getAuthor());
		
	}
	@Test
	public void testGetTitle() {
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals("lostTitle",book1.getTitle());
		
	}
	@Test
	public void testGetCallNumber() {
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals("2200",book1.getCallNumber());
	}
	@Test
	public void testGetId(){
		IBook book1=new Book("Book1","title1","24",23);
		assertEquals(100,book1.getID());
	}