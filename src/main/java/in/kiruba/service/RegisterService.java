package in.kiruba.service;

public class RegisterService {
	public static boolean login(String username,String password) {
		if(username.equalsIgnoreCase("admin") && password.length()<=5){
			return true;
			
		}
		else {
			return false;
		}
	}

	

}
