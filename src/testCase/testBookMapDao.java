package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.interfaces.daos.IBookHelper;
import library.interfaces.entities.IBook;

public class testBookMapDao {

	@Test
	public void test() {
		IBookHelper bookHelperObject =new BookHelper();
		IBook book1=bookHelperObject.makeBook("anderson", "BookTitle","24" , 64);
		
		BookMapDAO object1=new BookMapDAO(bookHelperObject);
		assertEquals(book1.toString(),bookHelperObject.makeBook("anderson", "BookTitle","24" , 64));
		//assertThat(book1).isEqualToComparingFieldByField();

	}

}
