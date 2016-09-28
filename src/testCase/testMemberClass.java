package testCase;

import static org.junit.Assert.*;

import org.junit.Test;

import library.entities.Member;
import library.interfaces.entities.IMember;

public class testMemberClass {

	@Test
	public void testMemberConstructor1() {
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		// creating an member class
		assertEquals(member1.getFirstName(),"Alex");
	}

	@Test
	public void testMemberConstructor2() {
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		// creating an member class
		assertEquals(member1.getLastName(),"smith");
	}
	@Test
	public void testMemberConstructor3() {
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		// creating an member class
		assertEquals(member1.getContactPhone(),"045055455");
	
	}
	@Test
	public void testMemberConstructor4() {
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		// creating an member class
		assertEquals(member1.getEmailAddress(),"smith@gmail.com");
	}
	
	@Test
	public void testMemberConstructor5() {
		IMember member1=new Member("Alex","smith","045055455","smith@gmail.com",45);
		// creating an member class
		assertEquals(member1.getID(),45);
	}
	
}
