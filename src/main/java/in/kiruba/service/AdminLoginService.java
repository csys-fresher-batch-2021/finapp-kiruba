package in.kiruba.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.kiruba.model.AdminLogin;
import in.kiruba.validation.UserValidation;

public class AdminLoginService {
	private AdminLoginService() {
		
	}
	private static final Map<String, ArrayList<AdminLogin>> adminlists = new HashMap<>();
	private static final ArrayList<AdminLogin> adminlist1 = new ArrayList<>();
	static {
		AdminLogin admin = new AdminLogin("Livith", "Livi15");
		adminlist1.add(admin);
		adminlists.put("Livith", adminlist1);
	}
	/*
	 * This method returns admin details present or not
	 */
	
	public static boolean adminLogin(String adminName, String password) {
		boolean isValid = false;
		if (adminlists.containsKey(adminName)&& UserValidation.isValidUserName(adminName)) {
			List<AdminLogin> userdetail =adminlists.get(adminName);
			
			for (AdminLogin detail : userdetail) {

				if (detail.getPassword().equals(password)) {
					isValid = true;

				}
			}

		}
		return isValid;
	}
	/*
	 * this method is used to add admin
	 */
	public static boolean addAdmin(String name,String password) {
		boolean valid=true;
		if(adminLogin(name, password)) {
			valid=false;
			
		}else {
			ArrayList<AdminLogin> addAdmin=new ArrayList<>();
			AdminLogin admin1=new AdminLogin(name,password);
			addAdmin.add(admin1);
			adminlists.put(name, addAdmin);
			
		}
		
		return valid;
	}
	


	

}
