package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.entities.Book;
import library.entities.Loan;
import library.entities.Member;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class loan {
	IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
	IBook book1=new Book("Book1","title1","24",23);
	@Test
	public void loanconstructtest() {
		Loan aaa=new Loan(book1,member1,null,null);
		
	}

}
