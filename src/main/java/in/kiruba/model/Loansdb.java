package in.kiruba.model;

public class Loansdb {
	private String loanNames;

	public Loansdb(String loanNames) {
		super();
		this.loanNames = loanNames;
	}

	public String getLoanNames() {
		return loanNames;
	}

	public void setLoanNames(String loanNames) {
		this.loanNames = loanNames;
	}

	@Override
	public String toString() {
		return "addloans [loanNames=" + loanNames + "]";
	}
	

}
