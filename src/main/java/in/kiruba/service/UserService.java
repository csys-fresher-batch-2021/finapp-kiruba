package in.kiruba.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import in.kiruba.model.User;
import in.kiruba.validation.UserValidation;

public class UserService {
	private UserService() {
		// default constructor
	}

	private static final Map<String, ArrayList<User>> userlists = new HashMap<>();
	private static final ArrayList<User> userlist1 = new ArrayList<>();
	static {
		User user1 = new User("Kiruba", "Kiru@15");
		userlist1.add(user1);
		userlists.put("Kiruba", userlist1);
	}

	public static Map<String, ArrayList<User>> getUserLists() {
		return userlists;
	}

	/**
	 * this method check key as UserName and password is equals of user password and
	 * validate the UserName.
	 * 
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password) {
		boolean isValid = false;
		if ((UserValidation.isValidUserName(username)) && (userlists.containsKey(username))) {
			List<User> userdetail = new ArrayList<>();
			userdetail = userlists.get(username);
			for (User detail : userdetail) {

				if (detail.getPassWord().equals(password)) {
					isValid = true;

				}
			}

		}
		return isValid;

	}

}
