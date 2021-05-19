package in.kiruba.Validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.validation.UserdetailSetValidation;

public class TestSetValidation {
    /*
     * this test checks string is empty or not with correct details.
     */
	@Test
	public void testIsEmptyString() {
		boolean valid=UserdetailSetValidation.isEmptyString("kavi");
		assertTrue(valid);
	}
	/*
     * this test checks string is empty or not with Incorrect details.
     */
	@Test
	public void testIsEmptyString1() {
		boolean valid=UserdetailSetValidation.isEmptyString("");
		assertFalse(valid);
	}
	
	@Test
	public void testIsEmptyString2() {
		boolean valid=UserdetailSetValidation.isEmptyString(" jeeva ");
		assertTrue(valid);
	}

}
