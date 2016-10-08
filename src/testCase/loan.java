package testCase;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class loan {
	IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
	IBook book1=new Book("Book1","taitle1","24",23);
	Date a =new Date();
	Loan aaa=new Loan(book1,member1,a,a);
	Loan bbb=new Loan(book1,member1,a,a);
	
	
	@Test
	public void loanconstructtest() {
		Loan aaa=new Loan(book1,member1,a,a);
		Loan bbb=new Loan(book1,member1,a,a);
		assertEquals(aaa,bbb);
	}
	@Test
	public void loanCheckoverdate() {
		assertEquals(aaa.checkOverDue(a),bbb.checkOverDue(a));
		
	}
	@Test
	public void testIsoverDue() {
		assertEquals(aaa.isOverDue(),bbb.isOverDue());
		
	}
	@Test
	public void testGetBook() {
		assertEquals(aaa.getBook(),bbb.getBook());
		
	}
	@Test
	public void loanGetBarrower() {
		assertEquals(aaa.getBorrower(),bbb.getBorrower());
		
	}
	@Test
	public void loanGetState() {
		assertEquals(aaa.getState(),bbb.getState());
		
	}

}
