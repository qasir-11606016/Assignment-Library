package testCase;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class TESTDAOBookClass {
	
	IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
	IBook book1=new Book("Book1","taitle1","24",23);
	IBook book2=new Book("Book1","taitle1","24",24);
	IBook book3=new Book("Book1","taitle1","24",25);
	IBookHelper bookHelperObject =new BookHelper();
	//IBook book15=bookHelperObject.makeBook("anderson", "BookTitle","24" , 64);
	
	BookMapDAO object1=new BookMapDAO(bookHelperObject);
	BookMapDAO object2=new BookMapDAO(bookHelperObject);

	
	
	Date a =new Date();
	Loan aaa=new Loan(book1,member1,a,a);

	@Test
	public void test1() {
		BookMapDAO object2=new BookMapDAO(bookHelperObject);
		assertEquals(object1,object2);
		
	}
	public void test2() {
		object1.addBook("author", "title", "calling nomber");
		object2.addBook("author", "title", "calling nomber");
		
		
	}
	
	

}
