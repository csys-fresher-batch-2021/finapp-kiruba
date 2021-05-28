package in.kiruba.Validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.validation.UserValidation;

public class TestValidation {
     /*
      * this test case valid user name with correct details.
      */
	@Test
	public void testUserValidation() {
		boolean valid=UserValidation.isValidUserName("Kiruba");
		assertTrue(valid);
		
	}
	/*
     * this test case valid user name with Incorrect details.
     */
	
	@Test
	public void testWithIncorrectUserValidation() {
		boolean valid=UserValidation.isValidUserName("kiruba123");
		assertFalse(valid);
		
	}


}
