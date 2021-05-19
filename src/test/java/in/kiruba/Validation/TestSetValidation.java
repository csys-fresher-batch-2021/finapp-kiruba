package in.kiruba.Validation;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.validation.UserdetailSetValidation;

public class TestSetValidation {

	@Test
	public void testIsEmptyString() {
		boolean valid=UserdetailSetValidation.isEmptyString("kavi");
		assertTrue(valid);
	}
	@Test
	public void testIsEmptyString1() {
		boolean valid=UserdetailSetValidation.isEmptyString("");
		assertFalse(valid);
	}

}
