package in.kiruba.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdminLogin {

	@Test
	public void testAdminLogin() {
		boolean isValid=AdminLoginService.adminLogin("Livith", "Livi15");
		assertTrue(isValid);
		
	}
	
	@Test
	public void testInvalidAdminLogin() {
		boolean isValid=AdminLoginService.adminLogin("livith", "Livi15");
		assertFalse(isValid);
		
	}

}
