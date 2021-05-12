package in.kiruba.service;

public class RegisterService {
	public static boolean login(String username,String password) {
		boolean isValid=false;
		if(username.equalsIgnoreCase("admin") && password.length()<=5){
			isValid=true;
			
		}return isValid;
		
		
	}

	

}
