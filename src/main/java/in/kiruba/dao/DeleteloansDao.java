package in.kiruba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.kiruba.model.Loansdb;
import in.kiruba.util.Connections;

public class DeleteloansDao {
	private DeleteloansDao() {
		
	}
	public static void deleteLoan(Loansdb type) throws SQLException, ClassNotFoundException  {
		Connection connection = null;
		PreparedStatement pst = null;
		// 1: Get the connection
		try {
			 connection = Connections.getConnection();
			// 2: Query

			String sql = "delete from loan where loan_name =?";// (performance faster)
			
			// 3: Execute
			 pst = connection.prepareStatement(sql);
			pst.setString(1, type.getLoanNames());

			 pst.executeUpdate();
			
			// 4: Release the connection
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}finally {
			Connections.close(connection,pst);
			
		}
	}

	

}
