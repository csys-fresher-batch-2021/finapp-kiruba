package in.kiruba.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdminLogin {
    /*
     * this test case check valid admin login with correct details.
     */
	@Test
	public void testAdminLogin() {
		boolean isValid=AdminLoginService.adminLogin("Livith", "Livi15");
		assertTrue(isValid);
		
	}
	/*
     * this test case check valid admin login with Incorrect details.
     */
	
	@Test
	public void testInvalidAdminLogin() {
		boolean isValid=AdminLoginService.adminLogin("livith", "Livi15");
		assertFalse(isValid);
		
	}

}
