package in.kiruba.service;

import java.sql.SQLException;

import in.kiruba.dao.DeleteloansDao;
import in.kiruba.model.Loansdb;

public class DeleteloansService {
	private DeleteloansService() {
		
	}


public static boolean deleteLoans2(Loansdb loans) {
	
	try {
		DeleteloansDao.Deleteloans1(loans);
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
	}
	return true;
	
	
}

}
