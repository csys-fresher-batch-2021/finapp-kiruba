package in.kiruba.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestDisplay {

	@Test
	public void testDisplay() {
		
			
			List<String> typesOfLoans=DisplayLoans.getLoanTypes();
			
			assertEquals(6, typesOfLoans.size());
		}
		
	}


