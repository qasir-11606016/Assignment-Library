package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.daos.BookHelper;
import library.daos.BookMapDAO;
import library.interfaces.daos.IBookHelper;

public class testBookMapDao {

	@Test
	public void test() {
		IBookHelper bookHelperObject =new BookHelper();
		bookHelperObject.makeBook("anderson", "BookTitle","24" , 64);
		BookMapDAO object1=new BookMapDAO(null);


	}

}
