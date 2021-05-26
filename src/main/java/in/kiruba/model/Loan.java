package in.kiruba.model;

public class Loan {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Loan(String type) {
		
		this.type = type;
	}

	@Override
	public String toString() {
		return "Loan [type=" + type + "]";
	} 
		
	
	

	

}
