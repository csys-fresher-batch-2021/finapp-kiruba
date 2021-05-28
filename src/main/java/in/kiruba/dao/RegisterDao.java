package in.kiruba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.kiruba.model.Register;
import in.kiruba.util.Connections;

public class RegisterDao {
	private RegisterDao() {
		
	}
	
	public static void register1(Register reg) {
		Connection connection=null;
		PreparedStatement pst=null;
		//step 1:
		try {
			 connection = Connections.getConnection();
			
			//step 2:
			
			String sql="insert into register_table5(username,userpassword,email,age,mobileNo,adhaarNo,address,pincode) values(?,?,?,?,?,?,?,?)";
			
			
			
		    pst=connection.prepareStatement(sql);
			pst.setString(1, reg.getName());
			pst.setString(2, reg.getPassword());
			pst.setString(3, reg.getEmail());
			pst.setString(4, reg.getAge());
			pst.setString(5, reg.getMoblieNo());
			pst.setString(6, reg.getAdhaarNo());
			pst.setString(7, reg.getAddress());
			pst.setString(8, reg.getPincode());
			pst.executeUpdate();
			
		
		} catch (ClassNotFoundException | SQLException e) {
	
			e.printStackTrace();
		}finally {
			Connections.close(connection,pst);
			
		}
		
	}

}
