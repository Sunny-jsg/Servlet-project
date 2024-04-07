package in.ashokit.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import in.ashokit.dto.RegisterDTO;
import in.ashokit.util.ConnectionFactory;



public class RegisterDAO {
	private final String INSERT_SQL = " INSERT INTO  login VALUES(?,?,?,?,?)";
	public boolean saveRegister( RegisterDTO dto)  throws Exception{
		

			Connection con = ConnectionFactory.getconnection();
			PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
			pstmt.setString(1,dto.getFirst_Name());
			pstmt.setString(2, dto.getLast_Name());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(2, dto.getGender());
			int count = pstmt.executeUpdate();
			con.close();
			return count > 0;
		}
	

		
	}


