package in.kiruba.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import in.kiruba.model.Loans;


public class TestDisplay {

	@Test
	public void testDisplay() {
		
			
			List<Loans> typesOfLoans=DisplayLoans.getLoanTypes();
			
			assertEquals(6, typesOfLoans.size());
		}
		
	}


