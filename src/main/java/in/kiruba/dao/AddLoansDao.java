package in.kiruba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.kiruba.model.Loansdb;
import in.kiruba.util.Connections;

public class AddLoansDao {
	private AddLoansDao() {

	}

	public static void addloans1(Loansdb type) throws SQLException, ClassNotFoundException {
		// 1: Get the connection
		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = Connections.getConnection();
			// 2: Query

			String sql = "insert into loan (loan_name) values (?)";// (performance faster)

			// 3: Execute
			pst = connection.prepareStatement(sql);
			pst.setString(1, type.getLoanNames());

			pst.executeUpdate();
			// 4: Release the connection
			Connections.close(connection, pst);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		} finally {
			Connections.close(connection, pst);

		}

	}

}
