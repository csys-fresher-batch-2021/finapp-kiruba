package in.kiruba.validation;

public class UserValidation {
	private UserValidation() {
		//default constructor
	}
	/**
	 * this method validate the UserName
	 * @param userName
	 * @return
	 */
	public static boolean isValidUserName(String userName) {
		boolean isValid=false;
		int length=userName.length();
		if(userName!=null&&(length>=4&&length<=7)) {
			isValid=true;
		}
		return isValid;
	}

	
}
