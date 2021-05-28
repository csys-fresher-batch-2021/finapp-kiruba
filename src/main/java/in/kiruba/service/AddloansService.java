package in.kiruba.service;

import java.sql.SQLException;

import in.kiruba.dao.AddLoansDao;
import in.kiruba.model.Loansdb;

public class AddloansService {
	private AddloansService() {
		//default constructor
	}
	
	public static boolean addloans2(Loansdb loans) {
		try {
	
		
			AddLoansDao.addloans1(loans);
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		return true;
		
		
	}


	
}
