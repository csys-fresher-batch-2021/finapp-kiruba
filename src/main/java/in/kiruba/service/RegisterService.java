package in.kiruba.service;

import in.kiruba.dao.RegisterDao;
import in.kiruba.model.Register;
import in.kiruba.validation.RegisterValidation;

public class RegisterService {
	private RegisterService() {
		
	}
	
	public static boolean register2(Register regobj) {
		try {
			RegisterDao.register1(regobj);
			
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}
		return true;
	}
	public static boolean isValidUserDetails(String name,String password,String email,String age,String mobileNo,String adhaarNo,String pincode) {
		RegisterValidation.isValidAdhaarNo(name);
		RegisterValidation.isValidPassword(password);
		
		RegisterValidation.isValidEmail(email);
		RegisterValidation.isValidAge(age);
		RegisterValidation.isValidAdhaarNo(adhaarNo);
		RegisterValidation.isValidMobileno(mobileNo);
		RegisterValidation.isValidPincode(pincode);
		return true;
		
	}

	
}
