package in.kiruba.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import in.kiruba.model.Loan;


public class TestDisplay {

	@Test
	public void testDisplay() {
		
			
			List<Loan> typesOfLoans=DisplayLoans.getLoanTypes();
			
			assertEquals(6, typesOfLoans.size());
		}
		
	}


