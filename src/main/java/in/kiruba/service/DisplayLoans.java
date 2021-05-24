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
		Loan loan1=new Loan("House Loan");
		Loan loan2=new Loan("Agriculture Loan");
		Loan loan3=new Loan("Personal Loan");
		Loan loan4=new Loan("Gold Loan");
		Loan loan5=new Loan("Education Loan");
		Loan loan6=new Loan("vehicle Loan");
		listOfLoanLists.add(loan1);
		listOfLoanLists.add(loan2);
		listOfLoanLists.add(loan3);
		listOfLoanLists.add(loan4);
		listOfLoanLists.add(loan5);
		listOfLoanLists.add(loan6);
		
	
		
		
		
	}
	

	public static List<Loan> getLoanTypes() {
		return listOfLoanLists;
	}

	

}
