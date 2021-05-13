package in.kiruba.service;

import java.util.ArrayList;
import java.util.List;

import in.kiruba.model.Loan;

public class DisplayLoans {
	private DisplayLoans() {
		//default constructor
	}
	private static final List<Loan>listOfLoanLists=new ArrayList<>();
	static {
		Loan Loan1=new Loan("House Loan");
		Loan Loan2=new Loan("Agriculture Loan");
		Loan Loan3=new Loan("Personal Loan");
		Loan Loan4=new Loan("Gold Loan");
		Loan Loan5=new Loan("Education Loan");
		Loan Loan6=new Loan("vehicle Loan");
		listOfLoanLists.add(Loan1);
		listOfLoanLists.add(Loan2);
		listOfLoanLists.add(Loan3);
		listOfLoanLists.add(Loan4);
		listOfLoanLists.add(Loan5);
		listOfLoanLists.add(Loan6);
		
	
		
		
		
	}
	

	public static List<Loan> getLoanTypes() {
		return listOfLoanLists;
	}
}
