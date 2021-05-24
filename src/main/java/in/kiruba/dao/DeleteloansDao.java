package in.kiruba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.kiruba.model.Loansdb;
import in.kiruba.util.Connections;

public class DeleteloansDao {
	private DeleteloansDao() {
		
	}
	public static void Deleteloans1(Loansdb type) throws SQLException, ClassNotFoundException  {
		// 1: Get the connection
		Connection connection = Connections.getConnection();
		// 2: Query

		String sql = "delete from loan where loan_name =?";// (performance faster)
		System.out.println(sql);
		// 3: Execute
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, type.getLoanNames());

		int rows = pst.executeUpdate();
		System.out.println("No of rows inserted :" + rows);
		// 4: Release the connection
		Connections.close(connection,pst);
	}

	

}
