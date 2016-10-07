package testCase;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class loanclassTest {

	@Test 
	public void bookTest() throws ParseException {
		IBook book1=new Book("jerry","LongLife","2411",23);
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		String date1="08/09/2016";
		String date2="10/09/2016";
		
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date testDate = null;
		try {
			testDate = (Date) df.parse(date1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date testDate1=(Date) df.parse(date2);
		
		ILoan loan=new Loan(book1,member1,testDate,testDate1);
		
		assertEquals(book1,loan.getBook());
		
		
		assertEquals(member1,loan.getBorrower());

	}
	@Test 
	public void memberTest() throws ParseException {
		IBook book1=new Book("jerry","LongLife","2411",23);
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		String date1="08/09/2016";
		String date2="10/09/2016";
		
		SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date testDate = (Date) df.parse(date1);
		
		Date testDate1=(Date) df.parse(date2);
		
		ILoan loan=new Loan(book1,member1,testDate,testDate1);
		
		assertSame(member1,loan.getBorrower());
		
	}
	
}
