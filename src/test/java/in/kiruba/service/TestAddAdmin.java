package in.kiruba.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddAdmin {
    /*
     * this test check method add admin the name and password already exist or not.  
     */
	@Test
	public void testAddAmin() {
		boolean valid=AdminLoginService.addAdmin("kavi", "kavi12");
		assertTrue(valid);
		
	}
	@Test
	public void testAddAmin1() {
		boolean valid=AdminLoginService.addAdmin("Livith", "Livi15");
		assertFalse(valid);
	}
		


}
