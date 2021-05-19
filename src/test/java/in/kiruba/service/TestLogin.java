package in.kiruba.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {
     /*
      * this test check login with correct details.
      */
	@Test
	public void testLogin() {
		boolean valid=UserService.login("Kiruba", "Kiru@15");
		assertTrue(valid);
		
	}
	/*
     * this test check login with Incorrect details.
     */
	@Test
	public void testInvalidLogin() {
		boolean valid=UserService.login("kiru", "livi12345");
		assertFalse(valid);
		
	}

}
