package in.ashokit.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.ashokit.util.ConnectionFactory;

public class BookDAO {
	private static final String INSERT_SQL = " INSERT INTO  BOOKS VALUES(?,?,?)";

	public boolean SaveBook(int bookId, String bookName, Double bookPrice) throws Exception {
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		pstmt.setInt(1, bookId);
		pstmt.setString(2, bookName);
		pstmt.setDouble(3, bookPrice);
		int count = pstmt.executeUpdate();
		con.close();
		return count > 0;
	}

}
