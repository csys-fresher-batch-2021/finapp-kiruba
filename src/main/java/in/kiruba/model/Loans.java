package in.kiruba.model;

public class Loans {
	private String loans;
	
	

	public String getLoans() {
		return loans;
	}



	public void setLoans(String loans) {
		this.loans = loans;
	}



	public Loans(String title) {
		this.loans = title;
	}
	


	@Override
	public String toString() {
		return "loantypes [title=" + loans + "]";
	}



	

}
