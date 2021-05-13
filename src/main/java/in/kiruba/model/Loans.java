package in.kiruba.model;

public class Loans {
	private String type;

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public  Loans(String title) {
		this.type = title;
	}

	@Override
	public String toString() {
		return "typetypes [title=" + type + "]";
	}

}
