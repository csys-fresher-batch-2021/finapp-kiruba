package in.kiruba.service;

import java.util.ArrayList;
import java.util.List;

public class DisplayLoans {
	private static List<String>listOfloansLists=new ArrayList<String>();
	static {
	
		
		listOfloansLists.add("House Loan");
		listOfloansLists.add("Education Loan");
		listOfloansLists.add("Agriculture Loan");
		listOfloansLists.add("Personal Loan");
		listOfloansLists.add("Gold Loan");
		listOfloansLists.add("Veicle Loan");
		
	}
	

	public static List<String> getLoanTypes() {
		return listOfloansLists;
	}
}
