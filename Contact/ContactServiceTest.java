package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class ContactServiceTest {

// Test the add methods.

	@Test

	public void testAdd(){

		ContactService cs = new ContactService();

		Contact t1 = new Contact("T001", "Jane", "Doe", "121", "TX ST");

		assertEquals(true, cs.addContact(t1));
		
	}

// Test the delete methods.

	@Test

	public void testDelete(){

		ContactService cs = new ContactService();

		Contact t1 = new Contact("T001", "Jane", "Doe", "121", "TX ST");

		Contact t2 = new Contact("T002", "John", "Doe", "122", "TX ST");

		Contact t3 = new Contact("T003", "Joey", "Doe", "123", "TX ST");

		cs.addContact(t1);

		cs.addContact(t2);

		cs.addContact(t3);

		assertEquals(true, cs.deleteContact("T002"));

		assertEquals(false, cs.deleteContact("T000"));

		assertEquals(false, cs.deleteContact("T002"));
		
	}

// Test the update methods.

	@Test

	public void testUpdate(){

		ContactService cs = new ContactService();

		Contact t1 = new Contact("T001", "Jane", "Doe", "121", "TX ST");

		Contact t2 = new Contact("T002", "John", "Doe", "122", "TX ST");

		Contact t3 = new Contact("T003", "Joey", "Doe", "123", "TX ST");

		cs.addContact(t1);

		cs.addContact(t2);

		cs.addContact(t3);

		assertEquals(true, cs.updateContact("T003", "JoeyFirst", "DoeLast", "123", "TX ST"));

		assertEquals(false, cs.updateContact("T004", "JoeyFirst", "DoeLast", "123", "TX ST"));
		
	}
	
}