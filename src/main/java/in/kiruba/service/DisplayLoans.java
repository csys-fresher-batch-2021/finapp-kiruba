package in.kiruba.service;

import java.util.ArrayList;
import java.util.List;

import in.kiruba.model.Loans;

public class DisplayLoans {
	private static List<Loans>listOfloansLists=new ArrayList<>();
	static {
		Loans loans1=new Loans("House Loan");
		Loans loans2=new Loans("Agriculture Loan");
		Loans loans3=new Loans("Personal Loan");
		Loans loans4=new Loans("Gold Loan");
		Loans loans5=new Loans("Education Loan");
		Loans loans6=new Loans("vehicle Loan");
		listOfloansLists.add(loans1);
		listOfloansLists.add(loans2);
		listOfloansLists.add(loans3);
		listOfloansLists.add(loans4);
		listOfloansLists.add(loans5);
		listOfloansLists.add(loans6);
		
	
		
		
		
	}
	

	public static List<Loans> getLoanTypes() {
		return listOfloansLists;
	}
}
