package in.kiruba.service;

import java.util.ArrayList;
import java.util.List;

import in.kiruba.model.Loans;

public class DisplayLoans {
	private static List<Loans>listOfloansLists=new ArrayList<Loans>();
	static {
		Loans Loans1=new Loans("House Loan");
		Loans Loans2=new Loans("Agriculture Loan");
		Loans Loans3=new Loans("Personal Loan");
		Loans Loans4=new Loans("Gold Loan");
		Loans Loans5=new Loans("Education Loan");
		Loans Loans6=new Loans("vehicle Loan");
		listOfloansLists.add(Loans1);
		listOfloansLists.add(Loans2);
		listOfloansLists.add(Loans3);
		listOfloansLists.add(Loans4);
		listOfloansLists.add(Loans5);
		listOfloansLists.add(Loans6);
		
	
		
		
		
	}
	

	public static List<Loans> getLoanTypes() {
		return listOfloansLists;
	}
}
