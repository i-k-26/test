package test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SampleDao {

	private final String JDBC_URL = "jdbc:mysql://localhost:3306/SampleDb?serverTimezone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "admin";

	public void getAll() {
//		List<User> cosmeList = new ArrayList<User>();

		Connection conn = null;

		String sql = "SELECT * FROM USER";

		try {
			//データベース準備
			conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
			//
			PreparedStatement pSmt = conn.prepareStatement(sql);
			//
			ResultSet rs = pSmt.executeQuery();

			while (rs.next()) {
				String p = rs.getString("name");
				int n = rs.getInt("age");

				System.out.println(p + ":" + n);
			}
		} catch (SQLException e) {
			e.printStackTrace();
//			return null;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
//					return null;
				}
			}
		}
		return ;
	}

}
