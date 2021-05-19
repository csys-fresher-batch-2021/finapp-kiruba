package in.kiruba.Validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.validation.UserValidation;

public class TestValidation {

	@Test
	public void testUserValidation() {
		boolean valid=UserValidation.isValidUserName("Kiruba");
		assertTrue(valid);
		
	}
	
	@Test
	public void testWithIncorrectUserValidation() {
		boolean valid=UserValidation.isValidUserName("kiruba123");
		assertFalse(valid);
		
	}


}
